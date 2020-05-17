package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignplacemark
  - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpin
  - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersigncircle
  - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignrectangle
  - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpolyline
  - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpolygon
  - typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignplacemark
  - typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersigncircle
  - typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignrectangle
  - typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignpolyline
  - typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignpolygon
  - typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignballoon
  - typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignhint
  - typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignplacemark
  - typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignrectangle
  - java.lang.String
  - typingsSlinky.yandexMaps.mod.IClassConstructor[typingsSlinky.yandexMaps.mod.IOverlay]
  - js.Function3[
/ * geometry * / typingsSlinky.yandexMaps.mod.IPixelLineStringGeometry, 
/ * data * / typingsSlinky.yandexMaps.mod.IDataManager | js.Object, 
/ * options * / js.Object, 
js.Promise[
  java.lang.String | typingsSlinky.yandexMaps.mod.IClassConstructor[typingsSlinky.yandexMaps.mod.IOverlay]
]]
*/
trait OverlayKey extends js.Object

object OverlayKey {
  @scala.inline
  def defaultNumbersignplacemark: typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignplacemark = "default#placemark".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignplacemark]
  @scala.inline
  def defaultNumbersignpin: typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpin = "default#pin".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpin]
  @scala.inline
  def defaultNumbersigncircle: typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersigncircle = "default#circle".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersigncircle]
  @scala.inline
  def defaultNumbersignrectangle: typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignrectangle = "default#rectangle".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignrectangle]
  @scala.inline
  def defaultNumbersignpolyline: typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpolyline = "default#polyline".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpolyline]
  @scala.inline
  def defaultNumbersignpolygon: typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpolygon = "default#polygon".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignpolygon]
  @scala.inline
  def hotspotNumbersignplacemark: typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignplacemark = "hotspot#placemark".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignplacemark]
  @scala.inline
  def hotspotNumbersigncircle: typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersigncircle = "hotspot#circle".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersigncircle]
  @scala.inline
  def hotspotNumbersignrectangle: typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignrectangle = "hotspot#rectangle".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignrectangle]
  @scala.inline
  def hotspotNumbersignpolyline: typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignpolyline = "hotspot#polyline".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignpolyline]
  @scala.inline
  def hotspotNumbersignpolygon: typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignpolygon = "hotspot#polygon".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.hotspotNumbersignpolygon]
  @scala.inline
  def htmlNumbersignballoon: typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignballoon = "html#balloon".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignballoon]
  @scala.inline
  def htmlNumbersignhint: typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignhint = "html#hint".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignhint]
  @scala.inline
  def htmlNumbersignplacemark: typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignplacemark = "html#placemark".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignplacemark]
  @scala.inline
  def htmlNumbersignrectangle: typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignrectangle = "html#rectangle".asInstanceOf[typingsSlinky.yandexMaps.yandexMapsStrings.htmlNumbersignrectangle]
  @scala.inline
  implicit def apply(
    value: js.Function3[
      /* geometry */ IPixelLineStringGeometry, 
      /* data */ IDataManager | js.Object, 
      /* options */ js.Object, 
      js.Promise[String | IClassConstructor[IOverlay]]
    ]
  ): OverlayKey = value.asInstanceOf[OverlayKey]
  @scala.inline
  implicit def apply(value: IClassConstructor[IOverlay]): OverlayKey = value.asInstanceOf[OverlayKey]
  @scala.inline
  implicit def apply(value: String): OverlayKey = value.asInstanceOf[OverlayKey]
}

