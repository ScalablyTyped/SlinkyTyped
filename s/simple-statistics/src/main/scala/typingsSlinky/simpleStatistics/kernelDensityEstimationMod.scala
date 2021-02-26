package typingsSlinky.simpleStatistics

import typingsSlinky.simpleStatistics.simpleStatisticsStrings.gaussian
import typingsSlinky.simpleStatistics.simpleStatisticsStrings.nrd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelDensityEstimationMod {
  
  /**
    * https://simplestatistics.org/docs/#kde
    */
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(X: js.Array[Double]): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(X: js.Array[Double], kernel: js.UndefOr[scala.Nothing], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(X: js.Array[Double], kernel: js.UndefOr[scala.Nothing], bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double]): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(X: js.Array[Double], kernel: js.Function1[/* u */ Double, Double], bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(
    X: js.Array[Double],
    kernel: js.Function1[/* u */ Double, Double],
    bandwidthMethod: BandwidthMethods
  ): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(X: js.Array[Double], kernel: Kernels): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(X: js.Array[Double], kernel: Kernels, bandwidthMethod: Double): js.Function1[/* x */ Double, Double] = js.native
  @JSImport("simple-statistics/src/kernel_density_estimation", JSImport.Default)
  @js.native
  def default(X: js.Array[Double], kernel: Kernels, bandwidthMethod: BandwidthMethods): js.Function1[/* x */ Double, Double] = js.native
  
  type BandwidthMethods = nrd
  
  type Kernels = gaussian
}
