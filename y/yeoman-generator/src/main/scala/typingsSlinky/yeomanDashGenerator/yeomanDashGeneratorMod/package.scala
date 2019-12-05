package typingsSlinky.yeomanDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yeomanDashGeneratorMod {
  import typingsSlinky.inquirer.inquirerMod.DistinctQuestion
  import typingsSlinky.rxjs.rxjsMod.Observable
  import typingsSlinky.yeomanDashGenerator.Anon_Store

  type Answers = typingsSlinky.inquirer.inquirerMod.Answers
  type Callback = js.Function1[/* err */ js.Any, Unit]
  type Question[T /* <: Answers */] = DistinctQuestion[T] with Anon_Store
  type Questions[A /* <: Answers */] = Question[A] | js.Array[Question[A]] | Observable[Question[A]]
}
