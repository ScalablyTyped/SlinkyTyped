package typingsSlinky.typescriptServices.global.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.Services.IClassifierHost
import typingsSlinky.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.ClassifierShim")
@js.native
class ClassifierShim protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.ClassifierShim {
  def this(factory: IShimFactory, host: IClassifierHost) = this()
  /* CompleteClass */
  override var classifier: typingsSlinky.typescriptServices.TypeScript.Services.Classifier = js.native
  /* CompleteClass */
  override var factory: js.Any = js.native
  /* CompleteClass */
  override var host: IClassifierHost = js.native
  /* CompleteClass */
  override def dispose(dummy: js.Any): Unit = js.native
  /* CompleteClass */
  override def getClassificationsForLine(text: String, lexState: typingsSlinky.typescriptServices.TypeScript.Services.EndOfLineState): String = js.native
}

