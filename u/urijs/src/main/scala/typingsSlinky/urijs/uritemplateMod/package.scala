package typingsSlinky.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uritemplateMod {
  type URITemplateCallback = js.Function1[
    /* keyName */ java.lang.String, 
    typingsSlinky.urijs.uritemplateMod.URITemplateValue
  ]
  type URITemplateInput = (org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.urijs.uritemplateMod.URITemplateValue | typingsSlinky.urijs.uritemplateMod.URITemplateCallback
  ]) | typingsSlinky.urijs.uritemplateMod.URITemplateCallback
  type URITemplateLiteral = java.lang.String
  type URITemplatePart = typingsSlinky.urijs.uritemplateMod.URITemplateLiteral | typingsSlinky.urijs.uritemplateMod.URITemplateExpression
  type URITemplateValue = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  ]
}
