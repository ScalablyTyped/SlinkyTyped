package typingsSlinky.urijs.uritemplateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - org.scalablytyped.runtime.StringDictionary[
typingsSlinky.urijs.uritemplateMod.URITemplateValue | typingsSlinky.urijs.uritemplateMod.URITemplateCallback]
  - typingsSlinky.urijs.uritemplateMod.URITemplateCallback
*/
trait URITemplateInput extends js.Object

object URITemplateInput {
  @scala.inline
  implicit def apply(value: StringDictionary[URITemplateValue | URITemplateCallback]): URITemplateInput = value.asInstanceOf[URITemplateInput]
  @scala.inline
  implicit def apply(value: URITemplateCallback): URITemplateInput = value.asInstanceOf[URITemplateInput]
}

