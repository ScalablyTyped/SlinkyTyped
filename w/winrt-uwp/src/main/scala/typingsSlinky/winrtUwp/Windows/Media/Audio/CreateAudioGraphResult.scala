package typingsSlinky.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio graph. */
@js.native
trait CreateAudioGraphResult extends js.Object {
  /** Gets the audio graph object. */
  var graph: AudioGraph = js.native
  /** Gets the status of audio graph creation. */
  var status: AudioGraphCreationStatus = js.native
}

object CreateAudioGraphResult {
  @scala.inline
  def apply(graph: AudioGraph, status: AudioGraphCreationStatus): CreateAudioGraphResult = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioGraphResult]
  }
  @scala.inline
  implicit class CreateAudioGraphResultOps[Self <: CreateAudioGraphResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraph(value: AudioGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: AudioGraphCreationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

