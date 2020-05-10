package typingsSlinky.storybookAddonInfo.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.storybookAddonInfo.storybookAddonInfoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var TableComponent: js.UndefOr[ReactComponentClass[TableComponentOptionProps]] = js.native
  var components: js.UndefOr[StringDictionary[ReactComponentClass[_]]] = js.native
  var excludedPropTypes: js.UndefOr[js.Array[String]] = js.native
  var header: js.UndefOr[Boolean] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated "marksyConf" option has been renamed to "components"
    */
  var marksyConf: js.UndefOr[js.Object] = js.native
  var maxPropArrayLength: js.UndefOr[Double] = js.native
  var maxPropObjectKeys: js.UndefOr[Double] = js.native
  var maxPropStringLength: js.UndefOr[Double] = js.native
  var maxPropsIntoLine: js.UndefOr[Double] = js.native
  var propTables: js.UndefOr[js.Array[ReactComponentClass[_]] | `false`] = js.native
  var propTablesExclude: js.UndefOr[js.Array[ReactComponentClass[_]]] = js.native
  var source: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[js.Object] = js.native
  var text: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableComponentFunctionComponent(value: ReactComponentClass[TableComponentOptionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableComponentComponentClass(value: ReactComponentClass[TableComponentOptionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableComponent(value: ReactComponentClass[TableComponentOptionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: StringDictionary[ReactComponentClass[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedPropTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedPropTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedPropTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedPropTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withMarksyConf(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marksyConf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarksyConf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marksyConf")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPropArrayLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPropArrayLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPropArrayLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPropArrayLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPropObjectKeys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPropObjectKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPropObjectKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPropObjectKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPropStringLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPropStringLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPropStringLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPropStringLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPropsIntoLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPropsIntoLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPropsIntoLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPropsIntoLine")(js.undefined)
        ret
    }
    @scala.inline
    def withPropTables(value: js.Array[ReactComponentClass[_]] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTables")(js.undefined)
        ret
    }
    @scala.inline
    def withPropTablesExclude(value: js.Array[ReactComponentClass[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTablesExclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropTablesExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTablesExclude")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Boolean): Self = {
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
    def withStyles(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

