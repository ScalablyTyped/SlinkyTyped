package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any CSS at-rule that contains other rules nested within it. */
@js.native
trait CSSGroupingRule extends CSSRule {
  val cssRules: org.scalajs.dom.raw.CSSRuleList = js.native
  def deleteRule(index: Double): Unit = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
}

@JSGlobal("CSSGroupingRule")
@js.native
object CSSGroupingRule extends Instantiable0[CSSGroupingRule]

