package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of base materials used in the 3D model. */
@js.native
trait Printing3DBaseMaterialGroup extends js.Object {
  /** Gets a group of base materials used in the 3D model. */
  var bases: IVector[Printing3DBaseMaterial] = js.native
  /** Gets the identifier (ID) of the base material group. */
  var materialGroupId: Double = js.native
}

object Printing3DBaseMaterialGroup {
  @scala.inline
  def apply(bases: IVector[Printing3DBaseMaterial], materialGroupId: Double): Printing3DBaseMaterialGroup = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBaseMaterialGroup]
  }
  @scala.inline
  implicit class Printing3DBaseMaterialGroupOps[Self <: Printing3DBaseMaterialGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBases(value: IVector[Printing3DBaseMaterial]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterialGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materialGroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

