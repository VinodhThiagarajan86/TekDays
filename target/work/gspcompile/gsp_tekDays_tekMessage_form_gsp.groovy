import com.tekdays.TekMessage
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_tekDays_tekMessage_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tekMessage/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'subject', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("tekMessage.subject.label"),'default':("Subject")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("subject"),'required':(""),'value':(tekMessageInstance?.subject)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'content', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("tekMessage.content.label"),'default':("Content")],-1)
printHtmlPart(2)
invokeTag('textArea','g',19,['name':("content"),'cols':("40"),'rows':("5"),'maxlength':("2000"),'required':(""),'value':(tekMessageInstance?.content)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'parent', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("tekMessage.parent.label"),'default':("Parent")],-1)
printHtmlPart(6)
invokeTag('select','g',28,['id':("parent"),'name':("parent.id"),'from':(com.tekdays.TekMessage.list()),'optionKey':("id"),'value':(tekMessageInstance?.parent?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'author', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("tekMessage.author.label"),'default':("Author")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("author"),'name':("author.id"),'from':(com.tekdays.TekUser.list()),'optionKey':("id"),'required':(""),'value':(tekMessageInstance?.author?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tekMessageInstance, field: 'event', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("tekMessage.event.label"),'default':("Event")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("event"),'name':("event.id"),'from':(com.tekdays.TekEvent.list()),'optionKey':("id"),'required':(""),'value':(tekMessageInstance?.event?.id),'class':("many-to-one")],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1411709592325L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
