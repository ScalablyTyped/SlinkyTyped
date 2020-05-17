package typingsSlinky.urijs.uritemplateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - org.scalablytyped.runtime.StringDictionary[java.lang.String]
  - js.UndefOr[scala.Nothing]
  - scala.Null
*/
trait URITemplateValue extends js.Object

object URITemplateValue {
  @scala.inline
  implicit def apply(value: js.Array[String]): URITemplateValue = value.asInstanceOf[URITemplateValue]
  @scala.inline
  implicit def apply(value: Null): URITemplateValue = value.asInstanceOf[URITemplateValue]
  @scala.inline
  implicit def apply(value: String): URITemplateValue = value.asInstanceOf[URITemplateValue]
  @scala.inline
  implicit def apply(value: StringDictionary[String]): URITemplateValue = value.asInstanceOf[URITemplateValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => URITemplateValue): URITemplateValue = value.asInstanceOf[URITemplateValue]
}

