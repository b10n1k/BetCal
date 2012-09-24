<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>CalBet_Main Form</title>
        </head>
        <f:view>
        <body>
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
            <pre>When you win the bet you would had earned all the lost money plus the wanted amount</pre>
            <h4>Good luck</h4>
            </p>
            <h5 align="left">
            <h:outputText value="#{dateBean.today}">
        <f:convertDateTime dateStyle="full" timeZone="EST" type="date" />
            </h:outputText>    
            </h5>
           
            <h:form id="dataValues" >
                <div>
                odd1: <h:inputText id="odd1" value="#{calculation.odd1}" label="Odd No1" size="10" ></h:inputText>
                <br />
                odd2: <h:inputText id="odd2" value="#{calculation.odd2}" label="Odd No2" size="10" ></h:inputText>
                <br />
                </div>
                Earn: <h:inputText id="willingProfit" value="#{calculation.profit}" label="Willing Profit" size="10" >Profit</h:inputText>
                <h:commandButton id="calExec" value="bet" action="#{calculation.execAlgorithm(calculation.profit, calculation.lost, calculation.odd1, calculation.odd2)}"></h:commandButton>
            </h:form>
                <hr />
                <font size="8px" color="red" >Lost Counter:
                <h:outputText id="lost" value="#{calculation.lost}" ></h:outputText></font><br />
                
                <f:subview id="monitor" >
                    <font size="10px" color="blue" >
                    <h:outputText id="moneyPlay" value="#{calculation.bet}"></h:outputText>
                    </font>
                </f:subview>
        </body>
        </f:view>
    </html>

