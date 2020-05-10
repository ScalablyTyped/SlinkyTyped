package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE). */
@js.native
trait CSSKeyframesRule extends CSSRule {
  val cssRules: org.scalajs.dom.raw.CSSRuleList = js.native
  var name: java.lang.String = js.native
  def appendRule(rule: java.lang.String): Unit = js.native
  def deleteRule(select: java.lang.String): Unit = js.native
  def findRule(select: java.lang.String): org.scalajs.dom.raw.CSSKeyframeRule | Null = js.native
}

@JSGlobal("CSSKeyframesRule")
@js.native
object CSSKeyframesRule
  extends Instantiable0[org.scalajs.dom.raw.CSSKeyframesRule]

