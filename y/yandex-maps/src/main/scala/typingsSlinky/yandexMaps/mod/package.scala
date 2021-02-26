package typingsSlinky.yandexMaps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IChildOnMap = typingsSlinky.yandexMaps.mod.IChild[typingsSlinky.yandexMaps.mod.IControlParent]
  
  type IControl = typingsSlinky.yandexMaps.mod.IChildOnMap
  
  type ICopyrightsAccessor = typingsSlinky.yandexMaps.mod.ICopyrightsProvider
  
  type IDomEventEmitter = typingsSlinky.yandexMaps.mod.IEventEmitter
  
  type IExpandableControlLayout = typingsSlinky.yandexMaps.mod.ILayout
  
  type IGeometryEditorRootModel = typingsSlinky.yandexMaps.mod.IGeometryEditorModel
  
  type IHintManager[T] = typingsSlinky.yandexMaps.mod.IPopupManager[T]
  
  type IMultiRouteReferencePoint = java.lang.String | js.Array[scala.Double] | typingsSlinky.yandexMaps.mod.geometry.Point
  
  type ISearchControlLayout = typingsSlinky.yandexMaps.mod.IExpandableControlLayout
  
  type ISelectableControlLayout = typingsSlinky.yandexMaps.mod.ILayout
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignopaque
    - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersigngeoObject
    - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignlayer
    - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersigntransparent
    - typingsSlinky.yandexMaps.yandexMapsStrings.defaultNumbersignsilent
    - java.lang.String
  */
  type InteractivityModelKey = typingsSlinky.yandexMaps.mod._InteractivityModelKey | java.lang.String
  
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
  type OverlayKey = typingsSlinky.yandexMaps.mod._OverlayKey | typingsSlinky.yandexMaps.mod.IClassConstructor[typingsSlinky.yandexMaps.mod.IOverlay] | (js.Function3[
    /* geometry */ typingsSlinky.yandexMaps.mod.IPixelLineStringGeometry, 
    /* data */ typingsSlinky.yandexMaps.mod.IDataManager | js.Object, 
    /* options */ js.Object, 
    js.Promise[
      java.lang.String | typingsSlinky.yandexMaps.mod.IClassConstructor[typingsSlinky.yandexMaps.mod.IOverlay]
    ]
  ]) | java.lang.String
  
  type PresetKey = java.lang.String
  
  @scala.inline
  def ready(): js.Promise[scala.Unit] = typingsSlinky.yandexMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ready(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Promise[scala.Unit] = (typingsSlinky.yandexMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ready(successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function0[_]): js.Promise[scala.Unit] = (typingsSlinky.yandexMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ready(successCallback: js.UndefOr[scala.Nothing], errorCallback: js.Function0[_], context: js.Object): js.Promise[scala.Unit] = (typingsSlinky.yandexMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ready(successCallback: js.Function0[_ | typingsSlinky.yandexMaps.mod.IReadyobject]): js.Promise[scala.Unit] = typingsSlinky.yandexMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ready(
    successCallback: js.Function0[_ | typingsSlinky.yandexMaps.mod.IReadyobject],
    errorCallback: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Promise[scala.Unit] = (typingsSlinky.yandexMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ready(
    successCallback: js.Function0[_ | typingsSlinky.yandexMaps.mod.IReadyobject],
    errorCallback: js.Function0[_]
  ): js.Promise[scala.Unit] = (typingsSlinky.yandexMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def ready(
    successCallback: js.Function0[_ | typingsSlinky.yandexMaps.mod.IReadyobject],
    errorCallback: js.Function0[_],
    context: js.Object
  ): js.Promise[scala.Unit] = (typingsSlinky.yandexMaps.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
}
