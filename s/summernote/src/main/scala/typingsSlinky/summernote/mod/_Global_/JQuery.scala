package typingsSlinky.summernote.mod._Global_

import typingsSlinky.jquery.JQuery_.Node
import typingsSlinky.summernote.mod._Global_.Summernote.CreateLinkOptions
import typingsSlinky.summernote.mod._Global_.Summernote.EditImageCallback
import typingsSlinky.summernote.mod._Global_.Summernote.Options
import typingsSlinky.summernote.summernoteStrings.backColor
import typingsSlinky.summernote.summernoteStrings.bold
import typingsSlinky.summernote.summernoteStrings.code
import typingsSlinky.summernote.summernoteStrings.createLink
import typingsSlinky.summernote.summernoteStrings.createRange
import typingsSlinky.summernote.summernoteStrings.destroy
import typingsSlinky.summernote.summernoteStrings.disable
import typingsSlinky.summernote.summernoteStrings.editorDotbold
import typingsSlinky.summernote.summernoteStrings.editorDotcreateRange
import typingsSlinky.summernote.summernoteStrings.editorDotfocus
import typingsSlinky.summernote.summernoteStrings.editorDotfontSize
import typingsSlinky.summernote.summernoteStrings.editorDotindent
import typingsSlinky.summernote.summernoteStrings.editorDotinsertImage
import typingsSlinky.summernote.summernoteStrings.editorDotinsertNode
import typingsSlinky.summernote.summernoteStrings.editorDotinsertOrderedList
import typingsSlinky.summernote.summernoteStrings.editorDotinsertText
import typingsSlinky.summernote.summernoteStrings.editorDotinsertUnorderedList
import typingsSlinky.summernote.summernoteStrings.editorDotisEmpty
import typingsSlinky.summernote.summernoteStrings.editorDotitalic
import typingsSlinky.summernote.summernoteStrings.editorDotjustifyCenter
import typingsSlinky.summernote.summernoteStrings.editorDotjustifyFull
import typingsSlinky.summernote.summernoteStrings.editorDotjustifyLeft
import typingsSlinky.summernote.summernoteStrings.editorDotjustifyRight
import typingsSlinky.summernote.summernoteStrings.editorDotoutdent
import typingsSlinky.summernote.summernoteStrings.editorDotpasteHTML
import typingsSlinky.summernote.summernoteStrings.editorDotredo
import typingsSlinky.summernote.summernoteStrings.editorDotremoveFormat
import typingsSlinky.summernote.summernoteStrings.editorDotrestoreRange
import typingsSlinky.summernote.summernoteStrings.editorDotsaveRange
import typingsSlinky.summernote.summernoteStrings.editorDotstrikethrough
import typingsSlinky.summernote.summernoteStrings.editorDotsubscript
import typingsSlinky.summernote.summernoteStrings.editorDotsuperscript
import typingsSlinky.summernote.summernoteStrings.editorDotunderline
import typingsSlinky.summernote.summernoteStrings.editorDotundo
import typingsSlinky.summernote.summernoteStrings.enable
import typingsSlinky.summernote.summernoteStrings.focus
import typingsSlinky.summernote.summernoteStrings.fontName
import typingsSlinky.summernote.summernoteStrings.fontSize
import typingsSlinky.summernote.summernoteStrings.foreColor
import typingsSlinky.summernote.summernoteStrings.formatH1
import typingsSlinky.summernote.summernoteStrings.formatH2
import typingsSlinky.summernote.summernoteStrings.formatH3
import typingsSlinky.summernote.summernoteStrings.formatH4
import typingsSlinky.summernote.summernoteStrings.formatH5
import typingsSlinky.summernote.summernoteStrings.formatH6
import typingsSlinky.summernote.summernoteStrings.formatPara
import typingsSlinky.summernote.summernoteStrings.indent
import typingsSlinky.summernote.summernoteStrings.insertImage
import typingsSlinky.summernote.summernoteStrings.insertNode
import typingsSlinky.summernote.summernoteStrings.insertOrderedList
import typingsSlinky.summernote.summernoteStrings.insertParagraph
import typingsSlinky.summernote.summernoteStrings.insertText
import typingsSlinky.summernote.summernoteStrings.insertUnorderedList
import typingsSlinky.summernote.summernoteStrings.isEmpty
import typingsSlinky.summernote.summernoteStrings.italic
import typingsSlinky.summernote.summernoteStrings.justifyCenter
import typingsSlinky.summernote.summernoteStrings.justifyFull
import typingsSlinky.summernote.summernoteStrings.justifyLeft
import typingsSlinky.summernote.summernoteStrings.justifyRight
import typingsSlinky.summernote.summernoteStrings.outdent
import typingsSlinky.summernote.summernoteStrings.pasteHTML
import typingsSlinky.summernote.summernoteStrings.redo
import typingsSlinky.summernote.summernoteStrings.removeFormat
import typingsSlinky.summernote.summernoteStrings.reset
import typingsSlinky.summernote.summernoteStrings.restoreRange
import typingsSlinky.summernote.summernoteStrings.saveRange
import typingsSlinky.summernote.summernoteStrings.strikethrough
import typingsSlinky.summernote.summernoteStrings.subscript
import typingsSlinky.summernote.summernoteStrings.superscript
import typingsSlinky.summernote.summernoteStrings.underline
import typingsSlinky.summernote.summernoteStrings.undo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def summernote(): JQuery = js.native
  def summernote(command: String): JQuery = js.native
  def summernote(command: String, markupString: String): JQuery = js.native
  def summernote(command: String, node: Node): JQuery = js.native
  def summernote(command: String, url: String, filename: String): JQuery = js.native
  def summernote(command: String, url: String, filename: EditImageCallback): JQuery = js.native
  def summernote(command: String, value: Double): JQuery = js.native
  def summernote(options: Options): JQuery = js.native
  @JSName("summernote")
  def summernote_backColor(command: backColor, color: String): JQuery = js.native
  @JSName("summernote")
  def summernote_bold(fontStyle: bold): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: code): JQuery = js.native
  @JSName("summernote")
  def summernote_code(command: code, markupStr: String): JQuery = js.native
  @JSName("summernote")
  def summernote_createLink(command: createLink, options: CreateLinkOptions): JQuery = js.native
  @JSName("summernote")
  def summernote_createRange(command: createRange): JQuery = js.native
  @JSName("summernote")
  def summernote_destroy(command: destroy): JQuery = js.native
  @JSName("summernote")
  def summernote_disable(command: disable): JQuery = js.native
  // Font style API
  @JSName("summernote")
  def summernote_editorbold(fontStyle: editorDotbold): JQuery = js.native
  // Basic API
  @JSName("summernote")
  def summernote_editorcreateRange(command: editorDotcreateRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfocus(command: editorDotfocus): JQuery = js.native
  @JSName("summernote")
  def summernote_editorfontSize(command: editorDotfontSize, fontSize: Double): JQuery = js.native
  @JSName("summernote")
  def summernote_editorindent(command: editorDotindent): JQuery = js.native
  // Insertion API
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String, filename: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertImage(command: editorDotinsertImage, url: String, filename: EditImageCallback): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertNode(command: editorDotinsertNode, node: Node): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertOrderedList(command: editorDotinsertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertText(command: editorDotinsertText, text: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorinsertUnorderedList(command: editorDotinsertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_editorisEmpty(command: editorDotisEmpty): Boolean = js.native
  @JSName("summernote")
  def summernote_editoritalic(fontStyle: editorDotitalic): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyCenter(command: editorDotjustifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyFull(command: editorDotjustifyFull): JQuery = js.native
  // Paragraph API
  @JSName("summernote")
  def summernote_editorjustifyLeft(command: editorDotjustifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_editorjustifyRight(command: editorDotjustifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_editoroutdent(command: editorDotoutdent): JQuery = js.native
  @JSName("summernote")
  def summernote_editorpasteHTML(command: editorDotpasteHTML, markup: String): JQuery = js.native
  @JSName("summernote")
  def summernote_editorredo(command: editorDotredo): JQuery = js.native
  @JSName("summernote")
  def summernote_editorremoveFormat(command: editorDotremoveFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_editorrestoreRange(command: editorDotrestoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsaveRange(command: editorDotsaveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_editorstrikethrough(fontStyle: editorDotstrikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsubscript(command: editorDotsubscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorsuperscript(command: editorDotsuperscript): JQuery = js.native
  @JSName("summernote")
  def summernote_editorunderline(fontStyle: editorDotunderline): JQuery = js.native
  @JSName("summernote")
  def summernote_editorundo(command: editorDotundo): JQuery = js.native
  @JSName("summernote")
  def summernote_enable(command: enable): JQuery = js.native
  @JSName("summernote")
  def summernote_focus(command: focus): JQuery = js.native
  @JSName("summernote")
  def summernote_fontName(command: fontName, fontName: String): JQuery = js.native
  @JSName("summernote")
  def summernote_fontSize(command: fontSize, fontSize: Double): JQuery = js.native
  @JSName("summernote")
  def summernote_foreColor(command: foreColor, color: String): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH1(command: formatH1): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH2(command: formatH2): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH3(command: formatH3): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH4(command: formatH4): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH5(command: formatH5): JQuery = js.native
  @JSName("summernote")
  def summernote_formatH6(command: formatH6): JQuery = js.native
  @JSName("summernote")
  def summernote_formatPara(command: formatPara): JQuery = js.native
  @JSName("summernote")
  def summernote_indent(command: indent): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String, filename: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertImage(command: insertImage, url: String, filename: EditImageCallback): JQuery = js.native
  @JSName("summernote")
  def summernote_insertNode(command: insertNode, node: Node): JQuery = js.native
  @JSName("summernote")
  def summernote_insertOrderedList(command: insertOrderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_insertParagraph(command: insertParagraph): JQuery = js.native
  @JSName("summernote")
  def summernote_insertText(command: insertText, text: String): JQuery = js.native
  @JSName("summernote")
  def summernote_insertUnorderedList(command: insertUnorderedList): JQuery = js.native
  @JSName("summernote")
  def summernote_isEmpty(command: isEmpty): Boolean = js.native
  @JSName("summernote")
  def summernote_italic(fontStyle: italic): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyCenter(command: justifyCenter): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyFull(command: justifyFull): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyLeft(command: justifyLeft): JQuery = js.native
  @JSName("summernote")
  def summernote_justifyRight(command: justifyRight): JQuery = js.native
  @JSName("summernote")
  def summernote_outdent(command: outdent): JQuery = js.native
  @JSName("summernote")
  def summernote_pasteHTML(command: pasteHTML, markup: String): JQuery = js.native
  @JSName("summernote")
  def summernote_redo(command: redo): JQuery = js.native
  @JSName("summernote")
  def summernote_removeFormat(command: removeFormat): JQuery = js.native
  @JSName("summernote")
  def summernote_reset(command: reset): JQuery = js.native
  @JSName("summernote")
  def summernote_restoreRange(command: restoreRange): JQuery = js.native
  @JSName("summernote")
  def summernote_saveRange(command: saveRange): JQuery = js.native
  @JSName("summernote")
  def summernote_strikethrough(fontStyle: strikethrough): JQuery = js.native
  @JSName("summernote")
  def summernote_subscript(command: subscript): JQuery = js.native
  @JSName("summernote")
  def summernote_superscript(command: superscript): JQuery = js.native
  @JSName("summernote")
  def summernote_underline(fontStyle: underline): JQuery = js.native
  @JSName("summernote")
  def summernote_undo(command: undo): JQuery = js.native
}

