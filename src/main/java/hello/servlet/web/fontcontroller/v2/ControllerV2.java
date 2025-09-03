package hello.servlet.web.fontcontroller.v2;

import hello.servlet.web.fontcontroller.WebView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV2 {

    WebView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
