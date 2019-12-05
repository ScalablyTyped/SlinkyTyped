package typingsSlinky.webglDashExt

import typingsSlinky.std.EXT_texture_filter_anisotropic
import typingsSlinky.std.WEBGL_compressed_texture_s3tc
import typingsSlinky.std.WEBGL_depth_texture
import typingsSlinky.std.WEBGL_lose_context
import typingsSlinky.webglDashExt.webglDashExtStrings.WEBGL_compressed_texture_pvrtc
import typingsSlinky.webglDashExt.webglDashExtStrings.WEBKIT_EXT_texture_filter_anisotropic
import typingsSlinky.webglDashExt.webglDashExtStrings.WEBKIT_WEBGL_compressed_texture_atc
import typingsSlinky.webglDashExt.webglDashExtStrings.WEBKIT_WEBGL_compressed_texture_s3tc
import typingsSlinky.webglDashExt.webglDashExtStrings.WEBKIT_WEBGL_depth_texture
import typingsSlinky.webglDashExt.webglDashExtStrings.WEBKIT_WEBGL_lose_context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGL1Extensions extends js.Object {
  @JSName("getExtension")
  def getExtension_EXTcolorbufferhalffloat(name: typingsSlinky.webglDashExt.webglDashExtStrings.EXT_color_buffer_half_float): EXT_color_buffer_half_float = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureatc(name: typingsSlinky.webglDashExt.webglDashExtStrings.WEBGL_compressed_texture_atc): WEBGL_compressed_texture_atc = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureetc1(name: typingsSlinky.webglDashExt.webglDashExtStrings.WEBGL_compressed_texture_etc1): WEBGL_compressed_texture_etc1 = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtexturepvrtc(name: WEBGL_compressed_texture_pvrtc): WEBKIT_WEBGL_compressed_texture_pvrtc = js.native
  // Prefixed versions appearing in the wild as per February 2018
  @JSName("getExtension")
  def getExtension_WEBKITEXTtexturefilteranisotropic(name: WEBKIT_EXT_texture_filter_anisotropic): EXT_texture_filter_anisotropic = js.native
   // Chrome
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLcompressedtextureatc(name: WEBKIT_WEBGL_compressed_texture_atc): WEBGL_compressed_texture_atc = js.native
   // Android
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLcompressedtexturepvrtc(name: typingsSlinky.webglDashExt.webglDashExtStrings.WEBKIT_WEBGL_compressed_texture_pvrtc): WEBKIT_WEBGL_compressed_texture_pvrtc = js.native
   // Safari iOS
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLcompressedtextures3tc(name: WEBKIT_WEBGL_compressed_texture_s3tc): WEBGL_compressed_texture_s3tc = js.native
   // Chrome
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLdepthtexture(name: WEBKIT_WEBGL_depth_texture): WEBGL_depth_texture = js.native
   // Chrome
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLlosecontext(name: WEBKIT_WEBGL_lose_context): WEBGL_lose_context = js.native
}

