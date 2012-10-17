<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*, java.util.*" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>CalBet_Main Form</title>
            <link rel="stylesheet" href="CSS/style.css" type="text/css"></link>
        </head>
        <f:view>
            <body >
                <div class="border">
            <h2 align="center">Bet Tool</h2>
            <p> You are can earn always money in bet using this small trick. The main idea is:
                <br />
        <ol>
            <li>choose two matches</li>
            <li>Choose an amount of money that want to earn</li>
            <li>Bet the output value</li>
            <li>if you lost repeat the procedure</li> 
         </ol>
            <br />
            <pre>When you win the bet you shall earn all the lost money plus the wanted amount</pre>
            </div>
            <h4>Good luck</h4>
            </p>
            <h5 align="left">
                <h:outputText id="curDate" value="#{calculation.date.toGMTString()}">
        <f:convertDateTime dateStyle="full" timeZone="EST" type="date" />
            </h:outputText>    
            </h5>
           
            <h:form id="dataValues" >
                <div class="calculator">
                odd1: <h:inputText id="odd1" value="#{calculation.odd1}" label="Odd No1" size="10" ></h:inputText>
                <br />
                odd2: <h:inputText id="odd2" value="#{calculation.odd2}" label="Odd No2" size="10" ></h:inputText>
                <br />
                </div>
                Earn: <h:inputText id="willingProfit" value="#{calculation.profit}" label="Willing Profit" size="10" >Profit</h:inputText>
                <h:commandButton id="calExec" value="bet" action="#{calculation.execAlgorithm(calculation.profit, calculation.lost, calculation.odd1, calculation.odd2)}"></h:commandButton>
            </h:form>
                <hr />
               
                
                    <font size="4px" color="blue" >
                    <h:outputText id="moneyPlay" value="#{calculation.bet}"></h:outputText>
                    <br />
                    
                    </font>
                     <font size="2px" color="red" >Lost Counter:
                         <h:outputText id="lost" value="#{calculation.lost}" ></h:outputText>
                <h:commandButton id="resetLost" value="Reset" action="#{calculation.setLost(0.0)}"
                                 onkeypress="document.getElementById('lost')=#{calculation.lost} ">
                  <!--  response.setIntHeader("Refresh",3);  -->
                </h:commandButton>
                     </font><br />
                
                
                    <h:outputText id="log" value="#{calculation.blog.reportList()}" ></h:outputText><br /> 
               <%-- <C:FOREACH var="calculation" items="${blog}">  
                    <C:OUT value="${calculation.blog.reportList.toString()}"></C:OUT>  
               
    </C:FOREACH>  --%>
                
        </body>

        </f:view>
    </html>

