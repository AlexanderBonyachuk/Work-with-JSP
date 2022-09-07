package ru.util.Servlets;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
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

@WebServlet("/upload")
public class FileUpload extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
            List<FileItem> multifiles = sf.parseRequest(req);

            for (FileItem item : multifiles) {
                System.out.println("write...");
                item.write(new File("F:\\project\\GIT\\" + item.getName()));
            }
            System.out.println("File successful upload");

        } catch (FileUploadException e) {
            System.out.println("Look exceptions!");
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error with upload file!");
            throw new RuntimeException(e);
        }

    }
}
