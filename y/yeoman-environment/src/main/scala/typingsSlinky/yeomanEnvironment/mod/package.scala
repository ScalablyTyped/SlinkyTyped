package typingsSlinky.yeomanEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Represents an adapter.
    */
  type Adapter = typingsSlinky.yeomanEnvironment.adapterMod.^
  
  /**
    * Represents an answer-hash.
    */
  type Answers = typingsSlinky.inquirer.mod.Answers
  
  /**
    * Provides the functionality to handle callbacks.
    */
  type Callback = /**
    * Handles a callback.
    *
    * @param err The error that occurred.
    */
  js.Function1[/* err */ js.Error | scala.Null, scala.Unit]
  
  /**
    * Represents a question.
    */
  type Question[T] = typingsSlinky.inquirer.mod.DistinctQuestion[T]
  
  /**
    * Represents a collection of questions.
    */
  type Questions[T] = typingsSlinky.inquirer.mod.QuestionCollection[T]
}
