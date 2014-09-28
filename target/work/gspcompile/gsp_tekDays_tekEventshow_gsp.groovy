import com.tekdays.TekEvent
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tekDays_tekEventshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tekEvent/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'tekEvent.label', default: 'TekEvent'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (tekEventInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("tekEvent.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(tekEventInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tekEventInstance?.city)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("tekEvent.city.label"),'default':("City")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(tekEventInstance),'field':("city")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tekEventInstance?.description)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("tekEvent.description.label"),'default':("Description")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(tekEventInstance),'field':("description")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tekEventInstance?.organizer)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("tekEvent.organizer.label"),'default':("Organizer")],-1)
printHtmlPart(23)
createTagBody(3, {->
expressionOut.print(tekEventInstance?.organizer?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("tekUser"),'action':("show"),'id':(tekEventInstance?.organizer?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tekEventInstance?.venue)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("tekEvent.venue.label"),'default':("Venue")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(tekEventInstance),'field':("venue")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tekEventInstance?.startDate)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("tekEvent.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(27)
invokeTag('formatDate','g',75,['date':(tekEventInstance?.startDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tekEventInstance?.endDate)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("tekEvent.endDate.label"),'default':("End Date")],-1)
printHtmlPart(29)
invokeTag('formatDate','g',84,['date':(tekEventInstance?.endDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tekEventInstance?.volunteers)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("tekEvent.volunteers.label"),'default':("Volunteers")],-1)
printHtmlPart(31)
for( v in (tekEventInstance.volunteers) ) {
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(v?.encodeAsHTML())
})
invokeTag('link','g',94,['controller':("tekUser"),'action':("show"),'id':(v.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(17)
if(true && (tekEventInstance?.sponsorships)) {
printHtmlPart(35)
invokeTag('message','g',102,['code':("tekEvent.sponsorships.label"),'default':("Sponsorships")],-1)
printHtmlPart(31)
for( s in (tekEventInstance.sponsorships) ) {
printHtmlPart(36)
createTagBody(4, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',105,['controller':("sponsorship"),'action':("show"),'id':(s.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(17)
if(true && (tekEventInstance?.tasks)) {
printHtmlPart(37)
invokeTag('message','g',113,['code':("tekEvent.tasks.label"),'default':("Tasks")],-1)
printHtmlPart(31)
for( t in (tekEventInstance.tasks) ) {
printHtmlPart(38)
createTagBody(4, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',116,['controller':("task"),'action':("show"),'id':(t.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(17)
if(true && (tekEventInstance?.messages)) {
printHtmlPart(39)
invokeTag('message','g',124,['code':("tekEvent.messages.label"),'default':("Messages")],-1)
printHtmlPart(31)
for( m in (tekEventInstance.messages) ) {
printHtmlPart(40)
createTagBody(4, {->
expressionOut.print(m?.encodeAsHTML())
})
invokeTag('link','g',127,['controller':("tekMessage"),'action':("show"),'id':(m.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(17)
if(true && (tekEventInstance?.respondents)) {
printHtmlPart(41)
invokeTag('message','g',135,['code':("tekEvent.respondents.label"),'default':("Respondents")],-1)
printHtmlPart(42)
invokeTag('fieldValue','g',137,['bean':(tekEventInstance),'field':("respondents")],-1)
printHtmlPart(16)
}
printHtmlPart(43)
createTagBody(2, {->
printHtmlPart(44)
createTagBody(3, {->
invokeTag('message','g',145,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',145,['class':("edit"),'action':("edit"),'resource':(tekEventInstance)],3)
printHtmlPart(45)
invokeTag('actionSubmit','g',146,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(46)
})
invokeTag('form','g',148,['url':([resource:tekEventInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(47)
})
invokeTag('captureBody','sitemesh',150,[:],1)
printHtmlPart(48)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411713325587L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
