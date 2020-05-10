package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.create method
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.sequelize.mod.ReturningOptions because Already inherited
- typingsSlinky.sequelize.mod.BuildOptions because var conflicts: returning. Inlined raw, isNewRecord, include */ @js.native
trait CreateOptions extends InstanceSaveOptions {
  /**
    * an array of include options - Used to build prefetched/included model instances. See `set`
    *
    * TODO: See set
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  /**
    * Is this record new
    */
  var isNewRecord: js.UndefOr[Boolean] = js.native
  /**
    * On Duplicate
    */
  var onDuplicate: js.UndefOr[String] = js.native
  /**
    * If set to true, values will ignore field and virtual setters.
    */
  var raw: js.UndefOr[Boolean] = js.native
}

object CreateOptions {
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNewRecord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNewRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDuplicate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDuplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDuplicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDuplicate")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}

