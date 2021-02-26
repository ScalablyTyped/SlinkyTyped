package typingsSlinky.tensorflowTfjsData

import typingsSlinky.tensorflowTfjsData.datasetMod.Dataset
import typingsSlinky.tensorflowTfjsData.datasourceMod.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textLineDatasetMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/datasets/text_line_dataset", "TextLineDataset")
  @js.native
  class TextLineDataset protected () extends Dataset[String] {
    /**
      * Create a `TextLineDataset`.
      *
      * @param input A `DataSource` providing a chunked, UTF8-encoded byte stream.
      */
    def this(input: DataSource) = this()
    
    val input: DataSource = js.native
  }
}
