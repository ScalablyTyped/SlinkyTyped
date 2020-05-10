package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CSSStyleRule represents a single CSS style rule. It implements the CSSRule interface with a type value of 1 (CSSRule.STYLE_RULE). */
@js.native
trait CSSStyleRule extends CSSRule {
  var selectorText: java.lang.String = js.native
  val style: org.scalajs.dom.raw.CSSStyleDeclaration = js.native
}

@JSGlobal("CSSStyleRule")
@js.native
object CSSStyleRule
  extends Instantiable0[org.scalajs.dom.raw.CSSStyleRule]

