package _03.upload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet("/file.upload")
public class FileUploadServlet extends HttpServlet {
    private final String UPLOAD_DIRECTORY = "/Users/zuleyhakaya/Desktop/uploadFolder";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (ServletFileUpload.isMultipartContent(req)) {
            try {
                DiskFileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload fileUpload = new ServletFileUpload(factory);
                List<FileItem> multiparts = fileUpload.parseRequest(req);

                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        String name = new File(item.getName()).getName();
                        item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
                    }
                }
                // File uploaded successfully
                req.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
                req.setAttribute("message", "File Upload Failed due to " + ex);
            }

        } else {
            req.setAttribute("message", "Sorry this Servlet only handles file upload request");
        }

        req.getRequestDispatcher("/result.jsp").forward(req, resp);



    }
}
