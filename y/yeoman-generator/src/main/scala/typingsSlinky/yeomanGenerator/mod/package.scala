package typingsSlinky.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Answers = typingsSlinky.inquirer.mod.Answers
  type Callback = js.Function1[/* err */ js.Any, scala.Unit]
  type Question[T /* <: typingsSlinky.yeomanGenerator.mod.Answers */] = typingsSlinky.inquirer.mod.DistinctQuestion[T] with typingsSlinky.yeomanGenerator.anon.Store
  type Questions[A /* <: typingsSlinky.yeomanGenerator.mod.Answers */] = typingsSlinky.yeomanGenerator.mod.Question[A] | js.Array[typingsSlinky.yeomanGenerator.mod.Question[A]] | typingsSlinky.rxjs.mod.Observable_[typingsSlinky.yeomanGenerator.mod.Question[A]]
}
