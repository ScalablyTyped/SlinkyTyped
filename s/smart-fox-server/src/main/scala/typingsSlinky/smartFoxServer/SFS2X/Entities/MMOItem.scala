package typingsSlinky.smartFoxServer.SFS2X.Entities

import typingsSlinky.smartFoxServer.SFS2X.Entities.Data.Vec3D
import typingsSlinky.smartFoxServer.SFS2X.Entities.Variables.MMOItemVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MMOItem extends js.Object {
  /** @type {Data.Vec3D} Returns the entry point of this item in the current user's AoI. */
  var aoiEnteryPoint: Vec3D = js.native
  /** @type {number} Indicates the id of this item. */
  var id: Double = js.native
  /**
    * Indicates whether this item has the specified MMOItem Variable set or not.
    * @param  {string}  varName The name of the MMOItem Variable whose existance must be checked.
    * @return {boolean}         Returns: true if an MMOItem Variable with the passed name is set for this item.
    */
  def containsVariable(varName: String): Boolean = js.native
  /**
    * Retrieves an MMOItem Variable from its name.
    * @param  {string}                    varName The name of the MMOItem Variable to be retrieved.
    * @return {Variables.MMOItemVariable}         The MMOItemVariable object, or null if no MMOItem Variable with the passed name is associated to this item.
    */
  def getVariable(varName: String): MMOItemVariable = js.native
  /**
    * Retrieves all the MMOItem Variables of this item.
    * @return {Variables.MMOItemVariable[]} The list of MMOItemVariable objects associated to this item.
    */
  def getVariables(): js.Array[MMOItemVariable] = js.native
}

object MMOItem {
  @scala.inline
  def apply(
    aoiEnteryPoint: Vec3D,
    containsVariable: String => Boolean,
    getVariable: String => MMOItemVariable,
    getVariables: () => js.Array[MMOItemVariable],
    id: Double
  ): MMOItem = {
    val __obj = js.Dynamic.literal(aoiEnteryPoint = aoiEnteryPoint.asInstanceOf[js.Any], containsVariable = js.Any.fromFunction1(containsVariable), getVariable = js.Any.fromFunction1(getVariable), getVariables = js.Any.fromFunction0(getVariables), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MMOItem]
  }
  @scala.inline
  implicit class MMOItemOps[Self <: MMOItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAoiEnteryPoint(value: Vec3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aoiEnteryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainsVariable(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsVariable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVariable(value: String => MMOItemVariable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVariables(value: () => js.Array[MMOItemVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariables")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

