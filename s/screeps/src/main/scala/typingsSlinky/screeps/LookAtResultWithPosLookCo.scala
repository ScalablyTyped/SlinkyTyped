package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined screeps.LookAtResultWithPos<screeps.LookConstant> */
@js.native
trait LookAtResultWithPosLookCo extends js.Object {
  var constructionSite: js.UndefOr[ConstructionSite[BuildableStructureConstant]] = js.native
  var creep: js.UndefOr[Creep] = js.native
  var deposit: js.UndefOr[Deposit] = js.native
  var energy: js.UndefOr[Resource[RESOURCE_ENERGY]] = js.native
  var flag: js.UndefOr[Flag] = js.native
  var mineral: js.UndefOr[Mineral[MineralConstant]] = js.native
  var nuke: js.UndefOr[Nuke] = js.native
  var powerCreep: js.UndefOr[PowerCreep] = js.native
  var resource: js.UndefOr[Resource[ResourceConstant]] = js.native
  var ruin: js.UndefOr[Ruin] = js.native
  var source: js.UndefOr[Source] = js.native
  var structure: js.UndefOr[Structure[StructureConstant]] = js.native
  var terrain: js.UndefOr[Terrain] = js.native
  var tombstone: js.UndefOr[Tombstone] = js.native
  var `type`: LookConstant = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object LookAtResultWithPosLookCo {
  @scala.inline
  def apply(`type`: LookConstant, x: Double, y: Double): LookAtResultWithPosLookCo = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookAtResultWithPosLookCo]
  }
  @scala.inline
  implicit class LookAtResultWithPosLookCoOps[Self <: LookAtResultWithPosLookCo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: LookConstant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstructionSite(value: ConstructionSite[BuildableStructureConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructionSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstructionSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructionSite")(js.undefined)
        ret
    }
    @scala.inline
    def withCreep(value: Creep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creep")(js.undefined)
        ret
    }
    @scala.inline
    def withDeposit(value: Deposit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deposit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeposit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deposit")(js.undefined)
        ret
    }
    @scala.inline
    def withEnergy(value: Resource[RESOURCE_ENERGY]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnergy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(js.undefined)
        ret
    }
    @scala.inline
    def withFlag(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
    @scala.inline
    def withMineral(value: Mineral[MineralConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mineral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMineral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mineral")(js.undefined)
        ret
    }
    @scala.inline
    def withNuke(value: Nuke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nuke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNuke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nuke")(js.undefined)
        ret
    }
    @scala.inline
    def withPowerCreep(value: PowerCreep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerCreep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerCreep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerCreep")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Resource[ResourceConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withRuin(value: Ruin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruin")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStructure(value: Structure[StructureConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(js.undefined)
        ret
    }
    @scala.inline
    def withTerrain(value: Terrain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrain")(js.undefined)
        ret
    }
    @scala.inline
    def withTombstone(value: Tombstone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tombstone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTombstone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tombstone")(js.undefined)
        ret
    }
  }
  
}

