package typingsSlinky.yeomanGenerator.anon

import typingsSlinky.inquirer.anon.Ui
import typingsSlinky.inquirer.mod.QuestionCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptModule extends js.Object {
  @JSName("promptModule")
  var promptModule_Original: typingsSlinky.inquirer.mod.PromptModule = js.native
  /**
    * Prompts the questions to the user.
    */
  def promptModule[T](questions: QuestionCollection[T]): js.Promise[T] with Ui = js.native
}

