package typingsSlinky.viewportMercatorProject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Bounds = js.Tuple2[
    typingsSlinky.viewportMercatorProject.mod.Coordinates, 
    typingsSlinky.viewportMercatorProject.mod.Coordinates
  ]
  
  type Coordinates = js.Tuple2[scala.Double, scala.Double]
  
  type CoordinatesZ = js.Tuple3[scala.Double, scala.Double, scala.Double]
  
  type Padding = scala.Double | typingsSlinky.viewportMercatorProject.anon.Bottom
  
  type ViewMatrix = js.Array[scala.Double]
  
  @scala.inline
  def addMetersToLngLat(
    lngLatZ: typingsSlinky.viewportMercatorProject.mod.CoordinatesZ,
    xyz: typingsSlinky.viewportMercatorProject.mod.CoordinatesZ
  ): typingsSlinky.viewportMercatorProject.mod.CoordinatesZ = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addMetersToLngLat")(lngLatZ.asInstanceOf[js.Any], xyz.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def addMetersToLngLat(
    lngLat: typingsSlinky.viewportMercatorProject.mod.Coordinates,
    xy: typingsSlinky.viewportMercatorProject.mod.Coordinates
  ): typingsSlinky.viewportMercatorProject.mod.Coordinates = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addMetersToLngLat")(lngLat.asInstanceOf[js.Any], xy.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.Coordinates]
  
  @scala.inline
  def fitBounds(options: typingsSlinky.viewportMercatorProject.anon.Bounds): typingsSlinky.viewportMercatorProject.mod.FittedBounds = typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fitBounds")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.FittedBounds]
  
  @scala.inline
  def flyToViewport(
    startProps: typingsSlinky.viewportMercatorProject.mod.FlyToViewportProps,
    endProps: typingsSlinky.viewportMercatorProject.mod.FlyToViewportProps,
    t: scala.Double
  ): typingsSlinky.viewportMercatorProject.mod.TransitionViewport = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("flyToViewport")(startProps.asInstanceOf[js.Any], endProps.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.TransitionViewport]
  
  @scala.inline
  def getDistanceScales(input: typingsSlinky.viewportMercatorProject.mod.DistanceScalesInput): typingsSlinky.viewportMercatorProject.mod.DistanceScales = typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceScales")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.DistanceScales]
  @scala.inline
  def getDistanceScales(input: typingsSlinky.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput): typingsSlinky.viewportMercatorProject.mod.HighPrecisionDistanceScales = typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceScales")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.HighPrecisionDistanceScales]
  
  @scala.inline
  def getMeterZoom(input: typingsSlinky.viewportMercatorProject.anon.Latitude): scala.Double = typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMeterZoom")(input.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def getProjectionMatrix(input: typingsSlinky.viewportMercatorProject.mod.ProjectionParametersInput): typingsSlinky.glMatrix.mod.mat4 = typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getProjectionMatrix")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.glMatrix.mod.mat4]
  
  @scala.inline
  def getProjectionParameters(input: typingsSlinky.viewportMercatorProject.mod.ProjectionParametersInput): typingsSlinky.viewportMercatorProject.mod.ProjectionParameters = typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getProjectionParameters")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.ProjectionParameters]
  
  @scala.inline
  def getViewMatrix(input: typingsSlinky.viewportMercatorProject.anon.Altitude): typingsSlinky.viewportMercatorProject.mod.ViewMatrix = typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getViewMatrix")(input.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.ViewMatrix]
  
  @scala.inline
  def lngLatToWorld(lngLat: typingsSlinky.viewportMercatorProject.mod.Coordinates, scale: scala.Double): typingsSlinky.viewportMercatorProject.mod.Coordinates = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lngLatToWorld")(lngLat.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.Coordinates]
  
  @scala.inline
  def normalizeViewportProps(props: typingsSlinky.viewportMercatorProject.mod.ViewportProps): typingsSlinky.viewportMercatorProject.mod.NormalizedViewportProps = typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeViewportProps")(props.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.NormalizedViewportProps]
  
  @scala.inline
  def pixelsToWorld(
    pixels: typingsSlinky.viewportMercatorProject.mod.CoordinatesZ,
    pixelUnprojectionMatrix: typingsSlinky.glMatrix.mod.mat4
  ): typingsSlinky.viewportMercatorProject.mod.CoordinatesZ = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def pixelsToWorld(
    pixels: typingsSlinky.viewportMercatorProject.mod.CoordinatesZ,
    pixelUnprojectionMatrix: typingsSlinky.glMatrix.mod.mat4,
    targetZ: scala.Double
  ): typingsSlinky.viewportMercatorProject.mod.CoordinatesZ = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any], targetZ.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def pixelsToWorld(
    pixels: typingsSlinky.viewportMercatorProject.mod.Coordinates,
    pixelUnprojectionMatrix: typingsSlinky.glMatrix.mod.mat4
  ): typingsSlinky.viewportMercatorProject.mod.CoordinatesZ = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def pixelsToWorld(
    pixels: typingsSlinky.viewportMercatorProject.mod.Coordinates,
    pixelUnprojectionMatrix: typingsSlinky.glMatrix.mod.mat4,
    targetZ: scala.Double
  ): typingsSlinky.viewportMercatorProject.mod.CoordinatesZ = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pixelsToWorld")(pixels.asInstanceOf[js.Any], pixelUnprojectionMatrix.asInstanceOf[js.Any], targetZ.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.CoordinatesZ]
  
  @scala.inline
  def worldToLngLat(point: typingsSlinky.viewportMercatorProject.mod.Coordinates, scale: scala.Double): typingsSlinky.viewportMercatorProject.mod.Coordinates = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("worldToLngLat")(point.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.Coordinates]
  
  @scala.inline
  def worldToPixels(
    coordinates: typingsSlinky.viewportMercatorProject.mod.CoordinatesZ,
    pixelProjectionMatrix: typingsSlinky.glMatrix.mod.mat4
  ): typingsSlinky.viewportMercatorProject.mod.CoordinatesZ = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("worldToPixels")(coordinates.asInstanceOf[js.Any], pixelProjectionMatrix.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.CoordinatesZ]
  @scala.inline
  def worldToPixels(
    coordinates: typingsSlinky.viewportMercatorProject.mod.Coordinates,
    pixelProjectionMatrix: typingsSlinky.glMatrix.mod.mat4
  ): typingsSlinky.viewportMercatorProject.mod.CoordinatesZ = (typingsSlinky.viewportMercatorProject.mod.^.asInstanceOf[js.Dynamic].applyDynamic("worldToPixels")(coordinates.asInstanceOf[js.Any], pixelProjectionMatrix.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.viewportMercatorProject.mod.CoordinatesZ]
}
