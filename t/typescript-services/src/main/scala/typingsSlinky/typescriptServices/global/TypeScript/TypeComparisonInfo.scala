package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeComparisonInfo")
@js.native
class TypeComparisonInfo ()
  extends typingsSlinky.typescriptServices.TypeScript.TypeComparisonInfo {
  def this(sourceComparisonInfo: typingsSlinky.typescriptServices.TypeScript.TypeComparisonInfo) = this()
  def this(
    sourceComparisonInfo: typingsSlinky.typescriptServices.TypeScript.TypeComparisonInfo,
    useSameIndent: Boolean
  ) = this()
  /* CompleteClass */
  override var flags: typingsSlinky.typescriptServices.TypeScript.TypeRelationshipFlags = js.native
  /* CompleteClass */
  override var indent: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var onlyCaptureFirstError: Boolean = js.native
  /* CompleteClass */
  override var stringConstantVal: typingsSlinky.typescriptServices.TypeScript.AST = js.native
  /* CompleteClass */
  override def addMessage(message: String): Unit = js.native
  /* CompleteClass */
  /* private */ override def indentString(): js.Any = js.native
}

