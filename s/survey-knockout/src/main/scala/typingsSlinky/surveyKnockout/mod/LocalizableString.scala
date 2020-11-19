package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "LocalizableString")
@js.native
class LocalizableString protected () extends js.Object {
  def this(owner: ILocalizableOwner) = this()
  def this(owner: ILocalizableOwner, useMarkdown: Boolean) = this()
  
  val calculatedText: String = js.native
  
  def equals(obj: js.Any): Boolean = js.native
  
  def getJson(): js.Any = js.native
  
  def getLocaleText(loc: String): String = js.native
  
  def getLocales(): js.Array[String] = js.native
  
  val hasHtml: Boolean = js.native
  
  def hasNonDefaultText(): Boolean = js.native
  
  val html: String = js.native
  
  val isEmpty: Boolean = js.native
  
  val locale: String = js.native
  
  def onChanged(): Unit = js.native
  
  /* protected */ def onCreating(): Unit = js.native
  
  def onGetTextCallback(str: String): String = js.native
  
  def onStrChanged(): Unit = js.native
  
  var owner: ILocalizableOwner = js.native
  
  val pureText: String = js.native
  
  val renderedHtml: String = js.native
  
  def setJson(value: js.Any): Unit = js.native
  
  def setLocaleText(loc: String, value: String): Unit = js.native
  
  var sharedData: LocalizableString = js.native
  
  def strChanged(): Unit = js.native
  
  var text: String = js.native
  
  val textOrHtml: String = js.native
  
  var useMarkdown: Boolean = js.native
}
/* static members */
@JSImport("survey-knockout", "LocalizableString")
@js.native
object LocalizableString extends js.Object {
  
  var SerializeAsObject: Boolean = js.native
  
  var defaultLocale: String = js.native
}
