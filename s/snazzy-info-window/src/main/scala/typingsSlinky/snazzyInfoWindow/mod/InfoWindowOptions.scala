package typingsSlinky.snazzyInfoWindow.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.googlemaps.google.maps.Map
import typingsSlinky.googlemaps.google.maps.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoWindowOptions extends js.Object {
  /**
    * The color to use for the background of the info window.
    * Possible Values: Any valid CSS color value.
    * @example '#FF0000', 'blue'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * A custom border around the info window.
    * Set to false to completely remove the border.
    * The units used for border should be the same as pointer.
    * @example
    * border: {
    *   width: '10px',
    *   color: '#FF0000'
    * }
    */
  var border: js.UndefOr[Border | Boolean] = js.native
  /**
    * A custom CSS border radius property to specify the rounded corners of the info window.
    * @example '2px 20px'
    */
  var borderRadius: js.UndefOr[String] = js.native
  /**
    * All callbacks are optional and can access the info window instance via this.
    */
  var callbacks: js.UndefOr[Callbacks] = js.native
  /**
    * The text or DOM Element to replace the default close button.
    * No click handler or positioning is added to your markup if you use this option.
    */
  var closeButtonMarkup: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the info window will close when the map is clicked.
    * An internal listener is added to the Google Maps click event which calls the close() method.
    * This will not activate on the Google Maps drag event when the user is panning the map.
    * @default true
    */
  var closeOnMapClick: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the info window will close when any other Snazzy Info Window is opened.
    * @default false
    */
  var closeWhenOthersOpen: js.UndefOr[Boolean] = js.native
  /**
    * The text or DOM Element to insert into the info window body.
    */
  var content: js.UndefOr[String | HTMLElement] = js.native
  /**
    * The offset from the map edge in pixels which is used when panning an info window into view.
    *
    * @example
    * edgeOffset: {
    *   top: 20,
    *   right: 20,
    *   bottom: 20,
    *   left: 20
    * }
    */
  var edgeOffset: js.UndefOr[EdgeOffset] = js.native
  /**
    * The font color to use for the content inside the body of the info window.
    * Possible Values: Any valid CSS color value.
    * @example '#FF0000', 'blue'
    */
  var fontColor: js.UndefOr[String] = js.native
  /**
    * The font size to use for the content inside the body of the info window.
    * Possible Values: Any valid CSS font size value.
    */
  var fontSize: js.UndefOr[String] = js.native
  /**
    * The Google Map associated to this info window.
    * Only required if you are not using a marker.
    */
  var map: js.UndefOr[Map[Element]] = js.native
  /**
    * The Google Maps marker associated to this info window.
    */
  var marker: js.UndefOr[Marker] = js.native
  /**
    * The max height in pixels of the info window.
    * @example 200
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * The max width in pixels of the info window.
    * @example 200
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /**
    * The offset from the marker.
    * This value should be different for each placement.
    * By default the offset is configured for the default Google Maps marker.
    *
    * @example
    * offset: {
    *   top: '10px',
    *   left: '20px'
    * }
    *
    */
  var offset: js.UndefOr[Offset] = js.native
  /**
    * Determines if the info window will open when the marker is clicked.
    * An internal listener is added to the Google Maps click event which calls the open() method.
    * @default true
    */
  var openOnMarkerClick: js.UndefOr[Boolean] = js.native
  /**
    * A custom padding size around the content of the info window.
    * Possible Values: Any valid CSS size value.
    * @example '10px', '2em', '5%'
    */
  var padding: js.UndefOr[String] = js.native
  /**
    * Determines if the info window will be panned into view when opened.
    * @default true
    */
  var panOnOpen: js.UndefOr[Boolean] = js.native
  /**
    * Choose where you want the info window to be displayed, relative to the marker.
    */
  var placement: js.UndefOr[PlacementOptions] = js.native
  /**
    * The height of the pointer from the info window to the marker.
    * Set to false to completely remove the pointer.
    * The units used for pointer should be the same as border.
    * Possible Values: Any valid CSS size value.
    * @example '10px'
    */
  var pointer: js.UndefOr[String | Boolean] = js.native
  /**
    * The latitude and longitude where the info window is anchored.
    * The offset will default to 0px when using this option.
    * Only required if you are not using a marker.
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  /**
    * The CSS properties for the shadow of the info window.
    * Set to false to completely remove the shadow.
    * @default
    * shadow: {
    *   h: '0px',
    *   v: '3px',
    *   blur: '6px',
    *   spread: '0px',
    *   opacity: 0.5,
    *   color: '#000'
    * }
    */
  var shadow: js.UndefOr[Shadow | Boolean] = js.native
  /**
    * Determines if the info window will show a close button.
    * @default true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * An optional CSS class to assign to the wrapper container of the info window.
    * Can be used for applying custom CSS to the info window.
    */
  var wrapperClass: js.UndefOr[String] = js.native
}

object InfoWindowOptions {
  @scala.inline
  def apply(): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOptions]
  }
  @scala.inline
  implicit class InfoWindowOptionsOps[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: Border | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: Callbacks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButtonMarkup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonMarkup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnMapClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnMapClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnMapClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnMapClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseWhenOthersOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWhenOthersOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseWhenOthersOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWhenOthersOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeOffset(value: EdgeOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOnMarkerClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnMarkerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnMarkerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnMarkerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPanOnOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panOnOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panOnOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: PlacementOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPointer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LatLng | LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Shadow | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(js.undefined)
        ret
    }
  }
  
}

