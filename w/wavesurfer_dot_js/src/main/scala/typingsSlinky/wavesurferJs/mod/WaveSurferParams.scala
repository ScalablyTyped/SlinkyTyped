package typingsSlinky.wavesurferJs.mod

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.ScriptProcessorNode
import typingsSlinky.wavesurferJs.AnonInstantiable
import typingsSlinky.wavesurferJs.wavesurferJsStrings.MediaElement
import typingsSlinky.wavesurferJs.wavesurferJsStrings.MediaElementWebAudio
import typingsSlinky.wavesurferJs.wavesurferJsStrings.WebAudio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveSurferParams extends js.Object {
  var audioContext: js.UndefOr[AudioContext] = js.native
  var audioRate: js.UndefOr[Double] = js.native
  var audioScriptProcessor: js.UndefOr[ScriptProcessorNode] = js.native
  var autoCenter: js.UndefOr[Boolean] = js.native
  var autoCenterImmediately: js.UndefOr[Boolean] = js.native
  var autoCenterRate: js.UndefOr[Double] = js.native
  var backend: js.UndefOr[WebAudio | MediaElement | MediaElementWebAudio] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var barGap: js.UndefOr[Double] = js.native
  var barHeight: js.UndefOr[Double] = js.native
  var barMinHeight: js.UndefOr[Double] = js.native
  var barRadius: js.UndefOr[Double] = js.native
  var barWidth: js.UndefOr[Double] = js.native
  var closeAudioContext: js.UndefOr[Boolean] = js.native
  var container: String | HTMLElement = js.native
  var cursorColor: js.UndefOr[String] = js.native
  var cursorWidth: js.UndefOr[Double] = js.native
  var drawingContextAttributes: js.UndefOr[js.Object] = js.native
  var duration: js.UndefOr[Double] = js.native
  var fillParent: js.UndefOr[Boolean] = js.native
  var forceDecode: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var hideScrollbar: js.UndefOr[Boolean] = js.native
  var interact: js.UndefOr[Boolean] = js.native
  var loopSelection: js.UndefOr[Boolean] = js.native
  var maxCanvasWidth: js.UndefOr[Double] = js.native
  var mediaControls: js.UndefOr[Boolean] = js.native
  var mediaType: js.UndefOr[String] = js.native
  var minPxPerSec: js.UndefOr[Double] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var partialRender: js.UndefOr[Boolean] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var plugins: js.UndefOr[js.Array[PluginDefinition]] = js.native
  var progressColor: js.UndefOr[String] = js.native
  var removeMediaElementOnDestroy: js.UndefOr[Boolean] = js.native
  var renderer: js.UndefOr[AnonInstantiable] = js.native
  var responsive: js.UndefOr[Boolean | Double] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var scrollParent: js.UndefOr[Boolean] = js.native
  var skipLength: js.UndefOr[Double] = js.native
  var splitChannels: js.UndefOr[Boolean] = js.native
  var waveColor: js.UndefOr[String] = js.native
  var xhr: js.UndefOr[XHROptions] = js.native
}

object WaveSurferParams {
  @scala.inline
  def apply(container: String | HTMLElement): WaveSurferParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaveSurferParams]
  }
  @scala.inline
  implicit class WaveSurferParamsOps[Self <: WaveSurferParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioContext(value: AudioContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioRate")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioScriptProcessor(value: ScriptProcessorNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioScriptProcessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioScriptProcessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioScriptProcessor")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCenterImmediately(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenterImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCenterImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenterImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCenterRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenterRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCenterRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCenterRate")(js.undefined)
        ret
    }
    @scala.inline
    def withBackend(value: WebAudio | MediaElement | MediaElementWebAudio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.undefined)
        ret
    }
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
    def withBarGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barGap")(js.undefined)
        ret
    }
    @scala.inline
    def withBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBarMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barMinHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBarRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseAudioContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAudioContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseAudioContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAudioContext")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawingContextAttributes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingContextAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawingContextAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingContextAttributes")(js.undefined)
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
    def withFillParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillParent")(js.undefined)
        ret
    }
    @scala.inline
    def withForceDecode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDecode")(js.undefined)
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
    def withHideScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withInteract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interact")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCanvasWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCanvasWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCanvasWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCanvasWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaControls")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPxPerSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPxPerSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPxPerSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPxPerSec")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveMediaElementOnDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMediaElementOnDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveMediaElementOnDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMediaElementOnDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollParent")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitChannels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withWaveColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withXhr(value: XHROptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(js.undefined)
        ret
    }
  }
  
}

