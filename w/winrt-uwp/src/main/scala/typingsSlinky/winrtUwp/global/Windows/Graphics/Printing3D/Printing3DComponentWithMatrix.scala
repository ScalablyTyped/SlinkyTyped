package typingsSlinky.winrtUwp.global.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Matrix4x4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D Manufacturing Format (3MF) component that's applied to the object definition with a matrix transform. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DComponentWithMatrix")
@js.native
/** Creates an instance of the Printing3DComponentWithMatrix class. */
class Printing3DComponentWithMatrix ()
  extends typingsSlinky.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponentWithMatrix {
  /** Gets or sets the 3D Manufacturing Format (3MF) primitive component that's applied to the object definition with a matrix transform. */
  /* CompleteClass */
  override var component: typingsSlinky.winrtUwp.Windows.Graphics.Printing3D.Printing3DComponent = js.native
  /** Gets or sets the matrix transform that's applied to the 3D Manufacturing Format (3MF) primitive component. */
  /* CompleteClass */
  override var matrix: Matrix4x4 = js.native
}

