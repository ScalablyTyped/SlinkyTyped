package typingsSlinky.standardEngine

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.eslint.mod.AST.Program
import typingsSlinky.eslint.mod.SourceCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSourceCode extends Instantiable2[/* text */ String, /* ast */ Program, SourceCode] {
  def splitLines(text: String): js.Array[String] = js.native
}

