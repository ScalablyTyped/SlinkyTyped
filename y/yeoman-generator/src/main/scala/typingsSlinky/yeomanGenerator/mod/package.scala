package typingsSlinky.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
  js.Function1[/* err */ js.Any, scala.Unit]
  
  /**
    * Represents a question.
    */
  type Question[T /* <: typingsSlinky.yeomanGenerator.mod.Answers */] = typingsSlinky.inquirer.mod.DistinctQuestion[T] with typingsSlinky.yeomanGenerator.anon.Store
  
  /**
    * Provides options for registering a prompt.
    */
  type QuestionRegistrationOptions[T /* <: typingsSlinky.yeomanGenerator.mod.Answers */] = typingsSlinky.yeomanGenerator.mod.Question[T] with typingsSlinky.yeomanGenerator.anon.ExportOption
  
  /**
    * Provides a set of questions.
    */
  type Questions[A /* <: typingsSlinky.yeomanGenerator.mod.Answers */] = typingsSlinky.yeomanGenerator.mod.Question[A] | js.Array[typingsSlinky.yeomanGenerator.mod.Question[A]] | typingsSlinky.rxjs.mod.Observable_[typingsSlinky.yeomanGenerator.mod.Question[A]]
}
