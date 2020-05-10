package typingsSlinky.supercluster.mod

import typingsSlinky.supercluster.superclusterBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterProperties extends js.Object {
  /**
    * Always `true` to indicate that the Feature is a Cluster and not
    * an individual point.
    */
  var cluster: `true` = js.native
  /** Cluster ID */
  var cluster_id: Double = js.native
  /** Number of points in the cluster. */
  var point_count: Double = js.native
  /**
    * Abbreviated number of points in the cluster as string if the number
    * is 1000 or greater (e.g. `1.3k` if the number is 1298).
    *
    * For less than 1000 points it is the same value as `point_count`.
    */
  var point_count_abbreviated: String | Double = js.native
}

object ClusterProperties {
  @scala.inline
  def apply(cluster: `true`, cluster_id: Double, point_count: Double, point_count_abbreviated: String | Double): ClusterProperties = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], cluster_id = cluster_id.asInstanceOf[js.Any], point_count = point_count.asInstanceOf[js.Any], point_count_abbreviated = point_count_abbreviated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterProperties]
  }
  @scala.inline
  implicit class ClusterPropertiesOps[Self <: ClusterProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCluster(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCluster_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint_count_abbreviated(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point_count_abbreviated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

