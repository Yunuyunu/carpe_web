﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.carpe.common.Consts"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko"><!-- 사용자 언어에 따라 lang 속성 변경. 예) 한국어: ko, 일본어: ja, 영어: en -->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>CARPE</title>
    <link rel="stylesheet" type="text/css" href="/carpe/resources/css/style.css" />
	<link href="/carpe/resources/jqwidgets/styles/jqx.base.css" rel="stylesheet" type="text/css">
	<link href="/carpe/resources/jqwidgets/styles/jqx.metrodark.css" rel="stylesheet" type="text/css">
	<link href="/carpe/resources/jqwidgets/styles/jqx.energyblue.css" rel="stylesheet" type="text/css">
	
	<script type="text/javascript" src="/carpe/resources/js/jquery-3.3.1.js"></script>
	<script type="text/javascript" src="/carpe/resources/jqwidgets/jqx-all.js"></script>
	<script type="text/javascript" src="/carpe/resources/jqwidgets/globalization/globalize.js"></script>
	<script type="text/javascript" src="/carpe/resources/js/common.js"></script>
	<script type="text/javascript" src="/carpe/resources/js/MYAPP.js"></script>	
</head>
<body>

	<!-- wrap -->
	<div class="wrap vsa-page bg-theme blue">

		<!-- header -->
		<%@ include file="../common/header.jsp" %>
		<!-- // header -->

		<!-- nav -->
		<nav class="nav bg-unit">
			<div class="bg-img-nav">
				<!--//
					목록 추가는 <li> 생성
					1Depth Menu class : 없음
					2Depth Menu class="level02"
					1Depth/2Depth Selected class="on"
					2Depth Menu Class : 1Depth Menu = unselected 상태일 경우에는 class="hide" // 2019-10-20 추가
				//-->
				<ul>
					<li><a href="/carpe/overview.do" class="icon overview">Overview</a></li>
					<li><a href="/carpe/evdnc.do" class="icon evidence">Evidence</a></li>
					<li><a href="#" class="icon analysis">Analysis</a></li>
						<!-- 2Depth Menu //-->
						<li class="level02 hide"><a href="#">Filesystem</a></li> 
						<li class="level02 hide"><a href="#">Artifact</a></li>
						<li class="level02 hide"><a href="#">검색</a></li>
						<!--// 2Depth Menu -->
					<li class="on"><a href="/carpe/communication.do" class="icon visualization">Visualization</a></li>						
						<!-- 2Depth Menu //-->
						<li class="level02"><a href="/carpe/communication.do">Communication<br/>model</a></li> 
						<li class="level02 on"><a href="/carpe/usage.do">Usage model</a></li>
						<li class="level02"><a href="/carpe/gps.do">GPS model</a></li>
						<!--// 2Depth Menu -->
					<li><a href="#" class="icon report">Report</a></li>
				</ul>
			</div>
		</nav>
		<!-- // nav -->

		<!-- main -->
		<main class="main">
			<section class="tit-area">
				<h3>Current Case : <%=(String)session.getAttribute(Consts.SESSION_CASE_NAME)%></h3>
				<a href="/carpe/case.do"><button type="button" class="btn-transparent icon ico-case-out"><span>case out</span></button></a>
			</section>

			<article class="container">
				<h4 class="blind">Usage model Chart</h4>
				<!--// Content 영역 //-->
				<!--// Side 메뉴가 우측에 있는 형태의 jqx-widget //-->
				<div class="content-box">
					<div class="content-area">
						<div class="btn-area">
							<button type="button" class="btn-case-01" id="setYear">연도 선택</button>
						</div>
						<div id="chartdiv" class="chart-area chart-type-1">
							<!-- Chart 영역 //-->
						</div>
					</div>
					<!--// Chart 영역 -->
					
				</div><!--// content-box -->

			</article>
		</main>
		<!-- // main -->

	</div>
	<!-- // wrap -->

	<!-- pop-up //-->
	<div id="yearList" class="pop wrap-pop jqx-window jqx-popup ofy-auto" style="position: absolute; top: 12rem; right: 13rem; width: 14rem; height: 36rem;display:none;">
		<div id="" class="pop-header jqx-window-header">
			<h1>연도 선택</h1>
			<div class="jqx-window-close-button-background">
				<div class="jqx-window-close-button jqx-icon-close" id="closeYear"></div>
			</div>
		</div>
		<div id="" class="pop-content">
			<ul>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2011" name="checkYear" type="checkbox" value="2011" />
					<label for="checkbox2011"><span class="text">2011</span></label>
				</li>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2012" name="checkYear" type="checkbox"  value="2012" />
					<label for="checkbox2012"><span class="text">2012</span></label>
				</li>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2013" name="checkYear" type="checkbox"  value="2013" />
					<label for="checkbox2013"><span class="text">2013</span></label>
				</li>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2014" name="checkYear" type="checkbox"  value="2014" />
					<label for="checkbox2014"><span class="text">2014</span></label>
				</li>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2015" name="checkYear" type="checkbox"  value="2015" />
					<label for="checkbox2015"><span class="text">2015</span></label>
				</li>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2016" name="checkYear" type="checkbox"  value="2016" />
					<label for="checkbox2016"><span class="text">2016</span></label>
				</li>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2017" name="checkYear" type="checkbox"  value="2017" />
					<label for="checkbox2017"><span class="text">2017</span></label>
				</li>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2018" name="checkYear" type="checkbox"  value="2018" />
					<label for="checkbox2018"><span class="text">2018</span></label>
				</li>
				<li class="checkbox checkbox-type-3">
					<input id="checkbox2019" name="checkYear" type="checkbox"  value="2019" />
					<label for="checkbox2019"><span class="text">2019</span></label>
				</li>
			</ul>
		</div><!-- // pop-content end -->
	</div><!-- // pop-up end -->

	<!-- 공통 javascript 영역 -->
	<script src="https://www.amcharts.com/lib/4/core.js"></script>
	<script src="https://www.amcharts.com/lib/4/charts.js"></script>
	<script src="https://www.amcharts.com/lib/4/themes/animated.js"></script>
	<!-- // 공통 javascript 영역 -->

	<!-- 현재 페이지에 필요한 js -->
	<script>
		var getUsageYearList = function(year) {
			$.ajax({
				url: "/carpe/usage_year_list.do",
		        dataType:'json',
		        data: { year : year},
		        async:false,
		        contenttype: "application/x-www-form-urlencoded; charset=UTF-8",
		        success:function(data){
		        	dataList = new Array();
		        	$(data["list"]).each(function(i, list) {
		        		 var tmpArr = {}
		        		 tmpArr.hour = list["month"] + '월';
		        		 tmpArr.weekday = list["year"] + '년';
		        		 tmpArr.value = list["cnt"];
		        		 dataList.push(tmpArr);

		            });
		        }
		    })
		    return dataList;
		}
		
		dataList = getUsageYearList();

		// Themes begin
		am4core.useTheme(am4themes_animated);
		// Themes end

		var chart = am4core.create("chartdiv", am4charts.XYChart);
		chart.maskBullets = false;

		var xAxis = chart.xAxes.push(new am4charts.CategoryAxis());
		var yAxis = chart.yAxes.push(new am4charts.CategoryAxis());

		xAxis.dataFields.category = "weekday";
		yAxis.dataFields.category = "hour";

		xAxis.renderer.grid.template.disabled = true;
		xAxis.renderer.minGridDistance = 40;

		yAxis.renderer.grid.template.disabled = true;
		yAxis.renderer.inversed = true;
		yAxis.renderer.minGridDistance = 30;

		var series = chart.series.push(new am4charts.ColumnSeries());
		series.dataFields.categoryX = "weekday";
		series.dataFields.categoryY = "hour";
		series.dataFields.value = "value";
		series.sequencedInterpolation = true;
		series.defaultState.transitionDuration = 3000;

		var bgColor = new am4core.InterfaceColorSet().getFor("background");

		var columnTemplate = series.columns.template;
		columnTemplate.strokeWidth = 1;
		columnTemplate.strokeOpacity = 0.2;
		columnTemplate.stroke = bgColor;
		columnTemplate.tooltipText = "{weekday}, {hour}: {value.workingValue.formatNumber('#.')}";
		columnTemplate.width = am4core.percent(100);
		columnTemplate.height = am4core.percent(100);

		series.heatRules.push({
		  target: columnTemplate,
		  property: "fill",
		  min: am4core.color(bgColor),
		  max: chart.colors.getIndex(0)
		});

		// heat legend
		var heatLegend = chart.bottomAxesContainer.createChild(am4charts.HeatLegend);
		heatLegend.width = am4core.percent(100);
		heatLegend.series = series;
		heatLegend.valueAxis.renderer.labels.template.fontSize = 9;
		heatLegend.valueAxis.renderer.minGridDistance = 30;

		// heat legend behavior
		series.columns.template.events.on("over", function(event) {
		  handleHover(event.target);
		})

		// click event
		series.columns.template.events.on("hit", function(ev) {
			year = ev.target.dataItem.categoryX.replace("년", "");
			month = ev.target.dataItem.categoryY.replace("월", "");

			location.href = '/carpe/usage_month.do?year=' + year + '&month=' + month;
		  	handleHover(ev.target);
		})

		function handleHover(column) {
		  if (!isNaN(column.dataItem.value)) {
		    heatLegend.valueAxis.showTooltipAt(column.dataItem.value)
		  }
		  else {
		    heatLegend.valueAxis.hideTooltip();
		  }
		}

		series.columns.template.events.on("out", function(event) {
		  heatLegend.valueAxis.hideTooltip();
		})

		chart.data = dataList;
		
		$( document ).ready( function() {
			$('#setYear').click(function(){
				$('#yearList').show();
			});
			
			$('#closeYear').click(function(){
				$('#yearList').hide();
			});
			
			$('input[name="checkYear"]').change(function() {
				var yearList = "";
				 $('input[name="checkYear"]').each(function() {
				      if(this.checked){//checked 처리된 항목의 값
				      	yearList += "," + this.value;
				      }
				 });
				 yearList = yearList.substring(1);
				 dataList = getUsageYearList(yearList);
				 chart.data = dataList;
			});
		});
	</script>
	<!-- // 현재 페이지에 필요한 js -->

</body>
</html>