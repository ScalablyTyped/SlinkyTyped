package typingsSlinky.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeLineConfiguration extends js.Object {
  /*
    * Optional path to css
    */
  var css: js.UndefOr[String] = js.native
  /*
    * Optional debug to console
    */
  var debug: js.UndefOr[Boolean] = js.native
  /*
    * Optional use a different div id for embed
    */
  var embed_id: js.UndefOr[String] = js.native
  /*
    * Optional font
    */
  var font: js.UndefOr[String] = js.native
  /*
    * required in order to use maptype
    */
  var gmap_key: js.UndefOr[String] = js.native
  /*
    * Optional location bar hashes
    */
  var hash_bookmark: js.UndefOr[Boolean] = js.native
  var height: String = js.native
  /*
    * Optional path to js
    */
  @JSName("js")
  var js_ : js.UndefOr[String] = js.native
  /*
    * Optional language
    */
  var lang: js.UndefOr[String] = js.native
  /*
    * Stamen Maps:
    * toner
    * toner-lines
    * toner-labels
    * watercolor
    * sterrain
    *
    * Google Maps:
    * ROADMAP
    * TERRAIN
    * HYBRID
    * SATELLITE
    *
    * OpenStreetMap:
    * osm
    */
  var maptype: js.UndefOr[String] = js.native
  /*
    * path to json/ or link to googlespreadsheet
    * source Should be either the path to the JSON resource to load, or a JavaScript object corresponding to the
    * Timeline model.
    *
    * Here is an example using a data object:
    *
    * var dataObject = {timeline: {headline: "Headline", type: ... }}
    * createStoryJS({
    * type:       'timeline',
    * width:      '800',
    * height:     '600',
    * source:     dataObject,
    * embed_id:   'my-timeline'
    * });
    * If source is a string, we will try to automatically recognize resources that are Twitter searches, Google
    * Spreadsheets or Storify stories. Failing that, we assume the source is either JSON or JSONP. If string
    * matches on .jsonp, we will treat it as JSONP, otherwise, we will append ?callback=onJSONP_Data.
    */
  var source: js.Any = js.native
  /*
    * Optional start at latest date
    */
  var start_at_end: js.UndefOr[Boolean] = js.native
  /*
    * Optional start at specific slide
    */
  var start_at_slide: js.UndefOr[String] = js.native
  /*
    * Optional tweak the default zoom level
    */
  var start_zoom_adjust: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: String = js.native
}

object ITimeLineConfiguration {
  @scala.inline
  def apply(height: String, source: js.Any, width: String): ITimeLineConfiguration = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeLineConfiguration]
  }
  @scala.inline
  implicit class ITimeLineConfigurationOps[Self <: ITimeLineConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbed_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbed_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed_id")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withGmap_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmap_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmap_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmap_key")(js.undefined)
        ret
    }
    @scala.inline
    def withHash_bookmark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash_bookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash_bookmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash_bookmark")(js.undefined)
        ret
    }
    @scala.inline
    def withJs_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJs_ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withMaptype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maptype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaptype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maptype")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_at_end(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_at_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_at_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_at_end")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_at_slide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_at_slide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_at_slide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_at_slide")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_zoom_adjust(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_zoom_adjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_zoom_adjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_zoom_adjust")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

