package typingsSlinky.typescriptServices.TypeScript.Syntax

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.PositionedElement
import typingsSlinky.typescriptServices.TypeScript.PositionedToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.EmptySyntaxList")
@js.native
class EmptySyntaxList () extends ISyntaxList {
  def findTokenInternal(parent: PositionedElement, position: Double, fullStart: Double): PositionedToken = js.native
  def toJSON(key: js.Any): js.Any = js.native
}

