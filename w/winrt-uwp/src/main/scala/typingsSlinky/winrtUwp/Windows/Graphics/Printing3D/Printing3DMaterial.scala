package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents all material resources in the 3D model. */
@js.native
trait Printing3DMaterial extends js.Object {
  /** Gets all base material groups used in the 3D model. */
  var baseGroups: IVector[Printing3DBaseMaterialGroup] = js.native
  /** Gets all color material groups used in the 3D model. */
  var colorGroups: IVector[Printing3DColorMaterialGroup] = js.native
  /** Gets all composite material groups used in the 3D model. */
  var compositeGroups: IVector[Printing3DCompositeMaterialGroup] = js.native
  /** Gets all multi-property groups used in the 3D model. */
  var multiplePropertyGroups: IVector[Printing3DMultiplePropertyMaterialGroup] = js.native
  /** Gets all 2D texture material groups used in the 3D model. */
  var texture2CoordGroups: IVector[Printing3DTexture2CoordMaterialGroup] = js.native
}

object Printing3DMaterial {
  @scala.inline
  def apply(
    baseGroups: IVector[Printing3DBaseMaterialGroup],
    colorGroups: IVector[Printing3DColorMaterialGroup],
    compositeGroups: IVector[Printing3DCompositeMaterialGroup],
    multiplePropertyGroups: IVector[Printing3DMultiplePropertyMaterialGroup],
    texture2CoordGroups: IVector[Printing3DTexture2CoordMaterialGroup]
  ): Printing3DMaterial = {
    val __obj = js.Dynamic.literal(baseGroups = baseGroups.asInstanceOf[js.Any], colorGroups = colorGroups.asInstanceOf[js.Any], compositeGroups = compositeGroups.asInstanceOf[js.Any], multiplePropertyGroups = multiplePropertyGroups.asInstanceOf[js.Any], texture2CoordGroups = texture2CoordGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMaterial]
  }
  @scala.inline
  implicit class Printing3DMaterialOps[Self <: Printing3DMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseGroups(value: IVector[Printing3DBaseMaterialGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorGroups(value: IVector[Printing3DColorMaterialGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompositeGroups(value: IVector[Printing3DCompositeMaterialGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiplePropertyGroups(value: IVector[Printing3DMultiplePropertyMaterialGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplePropertyGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexture2CoordGroups(value: IVector[Printing3DTexture2CoordMaterialGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture2CoordGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

