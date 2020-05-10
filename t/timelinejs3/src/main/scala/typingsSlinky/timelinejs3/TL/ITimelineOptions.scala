package typingsSlinky.timelinejs3.TL

import typingsSlinky.timelinejs3.timelinejs3Strings.back_to_start
import typingsSlinky.timelinejs3.timelinejs3Strings.bottom
import typingsSlinky.timelinejs3.timelinejs3Strings.nav_next
import typingsSlinky.timelinejs3.timelinejs3Strings.nav_previous
import typingsSlinky.timelinejs3.timelinejs3Strings.top
import typingsSlinky.timelinejs3.timelinejs3Strings.zoom_in
import typingsSlinky.timelinejs3.timelinejs3Strings.zoom_out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimelineOptions extends js.Object {
  /*
    * Default: 'tl-timeline
    * Removing the tl-timeline base class will disable all default stylesheets.
    */
  var base_class: js.UndefOr[String] = js.native
  /*
    * Default: false
    * If true, copious console logging will be enabled.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /*
    * Default: white
    * RGB values to use for slide backgrounds. Specify as hex code, CSS named color, or a Javascript object with r, g, and b properties from 0-255.
    */
  var default_bg_color: js.UndefOr[String] = js.native
  /*
    * Default: true
    */
  var dragging: js.UndefOr[Boolean] = js.native
  /*
    * Default: 1000
    * Animation duration (in milliseconds).
    */
  var duration: js.UndefOr[Double] = js.native
  /*
    * Default: TL.Ease.easeInOutQuint
    */
  var ease: js.UndefOr[js.Function0[Double]] = js.native
  /*
    * Default: null
    * Google Analytics ID.
    */
  var ga_property_id: js.UndefOr[js.Any] = js.native
  /*
    * Default: false
    * If set to true, TimelineJS will update the browser URL each time a slide advances, so that people can link directly to specific slides.
    */
  var hash_bookmark: js.UndefOr[Boolean] = js.native
  /*
    * Default: this._el.container.offsetHeight
    * The height of the timeline.
    */
  var height: js.UndefOr[Double] = js.native
  /*
    * The position in the zoom_sequence series used to scale the Timeline when it is first created. Takes precedence over scale_factor.
    */
  var initial_zoom: js.UndefOr[Double] = js.native
  /*
    * Default: false
    * If true, the class tl-timeline-embed is added to the outer Timeline container. Typically only used to support Timeline iframe embeds.
    */
  var is_embed: js.UndefOr[Boolean] = js.native
  /*
    * Default: 'en'
    */
  var language: js.UndefOr[String] = js.native
  /*
    * Default: 30
    * The minimum marker height (in pixels).
    */
  var marker_height_min: js.UndefOr[Double] = js.native
  /*
    * Default: 5
    * Top and bottom padding (in pixels) for markers.
    */
  var marker_padding: js.UndefOr[Double] = js.native
  /*
    * Default: 100
    * The minimum marker witdh (in pixels).
    */
  var marker_width_min: js.UndefOr[Double] = js.native
  /*
    * Default: 0
    */
  var menubar_height: js.UndefOr[Double] = js.native
  /*
    * Default: 100
    * optimal distance (in pixels) between ticks on axis
    */
  var optimal_tick_width: js.UndefOr[Double] = js.native
  /*
    * Default: 2
    * How many screen widths wide the timeline should be at first presentation.
    */
  var scale_factor: js.UndefOr[Double] = js.native
  /*
    * Default: ''
    * Can be used to help Timeline load related resources such as CSS themes and language files. Rarely needs to be set.
    */
  var script_path: js.UndefOr[String] = js.native
  /*
    * Default: '0%'
    */
  var slide_default_fade: js.UndefOr[String] = js.native
  /*
    * Default: 100
    * Padding (in pixels) on the left and right of each slide.
    */
  var slide_padding_lr: js.UndefOr[Double] = js.native
  /*
    * Default: false
    * If true, loads timeline on last slide.
    */
  var start_at_end: js.UndefOr[Boolean] = js.native
  /*
    * Default: 0
    * The first slide to display when the timeline is loaded.
    */
  var start_at_slide: js.UndefOr[Double] = js.native
  /*
    * Default: 150
    * The height in pixels of the timeline nav. Takes precedence over timenav_height_percentage.
    */
  var timenav_height: js.UndefOr[Double] = js.native
  /*
    * Default: 150
    * The minimum timeline nav height (in pixels).
    */
  var timenav_height_min: js.UndefOr[Double] = js.native
  /*
    * Default: 25
    * Specify the timeline nav height as a percentage of the screen instead of in pixels.
    */
  var timenav_height_percentage: js.UndefOr[Double] = js.native
  /*
    * Default: 40
    * Specify the timeline nav height as a percentage of a mobile device screen.
    */
  var timenav_mobile_height_percentage: js.UndefOr[Double] = js.native
  /*
    * Default: 'bottom'
    * Display the timeline nav on the top or bottom.
    */
  var timenav_position: js.UndefOr[bottom | top] = js.native
  /*
    * Default: true
    */
  var trackResize: js.UndefOr[Boolean] = js.native
  /*
    * Default: ['back_to_start','nav_next','nav_previous','zoom_in','zoom_out']
    */
  var track_events: js.UndefOr[js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out]] = js.native
  /*
    * Default: false
    * Use declared suffix on dates earlier than 0.
    */
  var use_bc: js.UndefOr[Boolean] = js.native
  /*
    * Default: this._el.container.offsetWidth
    * The width of the timeline.
    */
  var width: js.UndefOr[Double] = js.native
  /*
    * Default: [0.5, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
    * Array of values for TimeNav zoom levels. Each value is a scale_factor, which means that at any given level, the full timeline would require that many screens to display all events.
    */
  var zoom_sequence: js.UndefOr[js.Array[Double]] = js.native
}

object ITimelineOptions {
  @scala.inline
  def apply(): ITimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimelineOptions]
  }
  @scala.inline
  implicit class ITimelineOptionsOps[Self <: ITimelineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_class")(js.undefined)
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
    def withDefault_bg_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_bg_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_bg_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_bg_color")(js.undefined)
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEase(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.undefined)
        ret
    }
    @scala.inline
    def withGa_property_id(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ga_property_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGa_property_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ga_property_id")(js.undefined)
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial_zoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial_zoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_embed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_embed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_embed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_embed")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker_height_min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker_height_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker_height_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker_height_min")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker_padding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker_padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker_padding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker_padding")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker_width_min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker_width_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker_width_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker_width_min")(js.undefined)
        ret
    }
    @scala.inline
    def withMenubar_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menubar_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenubar_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menubar_height")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimal_tick_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimal_tick_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimal_tick_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimal_tick_width")(js.undefined)
        ret
    }
    @scala.inline
    def withScale_factor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale_factor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale_factor")(js.undefined)
        ret
    }
    @scala.inline
    def withScript_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script_path")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide_default_fade(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_default_fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide_default_fade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_default_fade")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide_padding_lr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_padding_lr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide_padding_lr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide_padding_lr")(js.undefined)
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
    def withStart_at_slide(value: Double): Self = {
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
    def withTimenav_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimenav_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_height")(js.undefined)
        ret
    }
    @scala.inline
    def withTimenav_height_min(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_height_min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimenav_height_min: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_height_min")(js.undefined)
        ret
    }
    @scala.inline
    def withTimenav_height_percentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_height_percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimenav_height_percentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_height_percentage")(js.undefined)
        ret
    }
    @scala.inline
    def withTimenav_mobile_height_percentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_mobile_height_percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimenav_mobile_height_percentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_mobile_height_percentage")(js.undefined)
        ret
    }
    @scala.inline
    def withTimenav_position(value: bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimenav_position: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timenav_position")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack_events(value: js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack_events: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_events")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_bc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_bc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_bc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_bc")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom_sequence(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom_sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom_sequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom_sequence")(js.undefined)
        ret
    }
  }
  
}

