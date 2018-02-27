<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>select_More actions...Duplicat (1)</name>
   <tag></tag>
   <elementGuidId>7fed1cc0-d26d-41c9-accb-75db84a075b5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>select</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>onchange</name>
      <type>Main</type>
      <value>javascript:  var bChecked = isChecked();  if (this.form.elements['o1'].selectedIndex != 0 &amp;&amp; !bChecked) { alert('Please select one or more items'); return false;} if (this.form.elements['o1'].selectedIndex == 1 &amp;&amp; confirm('Do you confirm the duplication ?')) {   setO(this.form.elements['o1'].value); submit();} else if (this.form.elements['o1'].selectedIndex == 2 &amp;&amp; confirm('Do you confirm the deletion ?')) {   setO(this.form.elements['o1'].value); submit();} else if (this.form.elements['o1'].selectedIndex == 3 || 
                        this.form.elements['o1'].selectedIndex == 4 || 
                        this.form.elements['o1'].selectedIndex == 5 || 
                        this.form.elements['o1'].selectedIndex == 6){   setO(this.form.elements['o1'].value); submit();} this.form.elements['o1'].selectedIndex = 0</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>name</name>
      <type>Main</type>
      <value>o1</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
	More actions...
	Duplicate
	Delete
	Massive Change
	Enable
	Disable
	Deploy Service
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;Tmainpage&quot;)/form[1]/table[@class=&quot;ToolbarTable table&quot;]/tbody[1]/tr[@class=&quot;ToolbarTR&quot;]/td[1]/select[1]</value>
   </webElementProperties>
</WebElementEntity>
