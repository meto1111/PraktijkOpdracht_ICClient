<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBerekenKrachtImpProxyid" scope="session" class="windmolen.BerekenKrachtImpProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBerekenKrachtImpProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleBerekenKrachtImpProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleBerekenKrachtImpProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        windmolen.BerekenKrachtImp getBerekenKrachtImp10mtemp = sampleBerekenKrachtImpProxyid.getBerekenKrachtImp();
if(getBerekenKrachtImp10mtemp == null){
%>
<%=getBerekenKrachtImp10mtemp %>
<%
}else{
        if(getBerekenKrachtImp10mtemp!= null){
        String tempreturnp11 = getBerekenKrachtImp10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String uur_1id=  request.getParameter("uur16");
        int uur_1idTemp  = Integer.parseInt(uur_1id);
        String windsnelheid_2id=  request.getParameter("windsnelheid18");
        int windsnelheid_2idTemp  = Integer.parseInt(windsnelheid_2id);
        int windEngerie13mtemp = sampleBerekenKrachtImpProxyid.windEngerie(uur_1idTemp,windsnelheid_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(windEngerie13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String windsnelheid_3id=  request.getParameter("windsnelheid23");
        int windsnelheid_3idTemp  = Integer.parseInt(windsnelheid_3id);
        String vermogen_4id=  request.getParameter("vermogen25");
        int vermogen_4idTemp  = Integer.parseInt(vermogen_4id);
        int berekenKracht20mtemp = sampleBerekenKrachtImpProxyid.berekenKracht(windsnelheid_3idTemp,vermogen_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(berekenKracht20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>