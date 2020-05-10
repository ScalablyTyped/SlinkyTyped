package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioWorkletNodeOptions extends AudioNodeOptions {
  var numberOfInputs: js.UndefOr[Double] = js.native
  var numberOfOutputs: js.UndefOr[Double] = js.native
  var outputChannelCount: js.UndefOr[js.Array[Double]] = js.native
  var parameterData: js.UndefOr[Record[java.lang.String, Double]] = js.native
  var processorOptions: js.UndefOr[js.Any] = js.native
}

object AudioWorkletNodeOptions {
  @scala.inline
  def apply(): AudioWorkletNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioWorkletNodeOptions]
  }
  @scala.inline
  implicit class AudioWorkletNodeOptionsOps[Self <: AudioWorkletNodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfInputs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInputs")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfOutputs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfOutputs")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputChannelCount(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputChannelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputChannelCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputChannelCount")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterData(value: Record[java.lang.String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterData")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorOptions")(js.undefined)
        ret
    }
  }
  
}

