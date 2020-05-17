package typingsSlinky.sipJs.distGrammarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sipJs.distGrammarMod.ILiteralExpectation
  - typingsSlinky.sipJs.distGrammarMod.IClassExpectation
  - typingsSlinky.sipJs.distGrammarMod.IAnyExpectation
  - typingsSlinky.sipJs.distGrammarMod.IEndExpectation
  - typingsSlinky.sipJs.distGrammarMod.IOtherExpectation
*/
trait Expectation extends js.Object

object Expectation {
  @scala.inline
  implicit def apply(value: IAnyExpectation): Expectation = value.asInstanceOf[Expectation]
  @scala.inline
  implicit def apply(value: IClassExpectation): Expectation = value.asInstanceOf[Expectation]
  @scala.inline
  implicit def apply(value: IEndExpectation): Expectation = value.asInstanceOf[Expectation]
  @scala.inline
  implicit def apply(value: ILiteralExpectation): Expectation = value.asInstanceOf[Expectation]
  @scala.inline
  implicit def apply(value: IOtherExpectation): Expectation = value.asInstanceOf[Expectation]
}

