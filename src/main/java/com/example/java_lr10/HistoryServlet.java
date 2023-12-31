package com.example.java_lr10;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "cityHistory", value = "/cityHistory")
public class HistoryServlet extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String history = "Первое официальное письменное упоминание о Кривом Роге встречается в издании «Опись основанных почтовых станций по речке Ингулец от Кременчуга до Херсона» и датировано 27 апреля (8 мая по новому стилю) 1775 года. Вдоль почтового тракта, соединявшего центр с югом, начали строиться жилые дома. Почтовая улица (ныне Почтовый проспект) стала отправным пунктом расселения жителей в Кривом Роге В действительности, в 1761 году в Кривом Роге была открыта церковь Святого Николая[источник не указан 1699 дней], что ставит под сомнение официальную дату. Кроме того, в упомянутой «Описи…» говорится «станция в Кривом Роге», но не «станция Кривой Рог», что прямо указывает на существование поселения на момент создания документа." +
                "В 1781 году по пути в Херсон местечко посетил будущий академик Василий Зуев, где у берегов реки Саксагань обратил внимание на обнажения железистых кварцитов, которые назвал «железным шифером»[9]. Предположил, что название города означает «кривой мыс» по извилистому руслу реки Саксагань в месте её впадения в реку Ингулец." +
                "15 декабря 1860 года Кривой Рог приобрёл статус местечка в ведомстве Херсонского поселения[10] в составе Моисеевской волости Александрийского уезда Херсонской губернии. Насчитывалось 3644 жителя. Основным его населением были евреи." ;
        request.setAttribute("history", history);
        request.getRequestDispatcher("/cityHistory.jsp").forward(request,response);
    }

    public void destroy() {
    }
}