package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the VerifyAsync method. */
@js.native
trait Printing3DMeshVerificationResult extends js.Object {
  /** Gets a value that indicates if the mesh is valid. */
  var isValid: Boolean = js.native
  /** Gets the triangles with non-manifold edges, if applicable. */
  var nonmanifoldTriangles: IVectorView[Double] = js.native
  /** Gets the reverse normal triangles, if applicable. */
  var reversedNormalTriangles: IVectorView[Double] = js.native
}

object Printing3DMeshVerificationResult {
  @scala.inline
  def apply(
    isValid: Boolean,
    nonmanifoldTriangles: IVectorView[Double],
    reversedNormalTriangles: IVectorView[Double]
  ): Printing3DMeshVerificationResult = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], nonmanifoldTriangles = nonmanifoldTriangles.asInstanceOf[js.Any], reversedNormalTriangles = reversedNormalTriangles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMeshVerificationResult]
  }
  @scala.inline
  implicit class Printing3DMeshVerificationResultOps[Self <: Printing3DMeshVerificationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonmanifoldTriangles(value: IVectorView[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonmanifoldTriangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReversedNormalTriangles(value: IVectorView[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversedNormalTriangles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

