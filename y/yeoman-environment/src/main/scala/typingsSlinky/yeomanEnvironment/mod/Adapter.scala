package typingsSlinky.yeomanEnvironment.mod

import typingsSlinky.inquirer.mod.DistinctQuestion
import typingsSlinky.inquirer.mod.QuestionCollection
import typingsSlinky.yeomanEnvironment.mod.Adapter.Questions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  def diff(actual: String, expected: String): String = js.native
  def prompt[T](questions: Questions[T]): js.Promise[T] = js.native
  def prompt[T1, T2](questions: Questions[T1], cb: js.Function1[/* res */ T1, T2]): js.Promise[T2] = js.native
}

@JSImport("yeoman-environment", "Adapter")
@js.native
object Adapter extends js.Object {
  type Answers = typingsSlinky.inquirer.mod.Answers
  type Question[T] = DistinctQuestion[T]
  type Questions[T] = QuestionCollection[T]
}

