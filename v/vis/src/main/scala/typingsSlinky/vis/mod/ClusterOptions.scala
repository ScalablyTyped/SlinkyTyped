package typingsSlinky.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOptions extends js.Object {
  
  /**
    * Optional.
    * This is an object containing the options for the edges connected to the cluster.
    * All options described in the edges module are allowed.
    * Using this, you can style the edges connecting to the cluster any way you want.
    * If none are provided, the options from the edges that are replaced are used.
    * If undefined, default edge options will be used.
    */
  var clusterEdgeProperties: js.UndefOr[EdgeOptions] = js.native
  
  /**
    * Optional.
    * This is an object containing the options for the cluster node.
    * All options described in the nodes module are allowed.
    * This allows you to style your cluster node any way you want.
    * This is also the style object that is provided in the processProperties function for fine tuning.
    * If undefined, default node options will be used.
    */
  var clusterNodeProperties: js.UndefOr[NodeOptions] = js.native
  
  /**
    * Optional for all but the cluster method.
    * The cluster module loops over all nodes that are selected to be in the cluster
    * and calls this function with their data as argument. If this function returns true,
    * this node will be added to the cluster. You have access to all options (including the default)
    * as well as any custom fields you may have added to the node to determine whether or not to include it in the cluster.
    */
  var joinCondition: js.UndefOr[js.Function1[/* nodeOptions */ js.Any, Boolean]] = js.native
  
  /**
    * Optional.
    * Before creating the new cluster node, this (optional) function will be called with the properties
    * supplied by you (clusterNodeProperties), all contained nodes and all contained edges.
    * You can use this to update the properties of the cluster based on which items it contains.
    * The function should return the properties to create the cluster node.
    */
  var processProperties: js.UndefOr[
    js.Function3[
      /* clusterOptions */ js.Any, 
      /* childNodesOptions */ js.Array[_], 
      /* childEdgesOptions */ js.Array[_], 
      _
    ]
  ] = js.native
}
object ClusterOptions {
  
  @scala.inline
  def apply(): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOptions]
  }
  
  @scala.inline
  implicit class ClusterOptionsOps[Self <: ClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterEdgeProperties(value: EdgeOptions): Self = this.set("clusterEdgeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterEdgeProperties: Self = this.set("clusterEdgeProperties", js.undefined)
    
    @scala.inline
    def setClusterNodeProperties(value: NodeOptions): Self = this.set("clusterNodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterNodeProperties: Self = this.set("clusterNodeProperties", js.undefined)
    
    @scala.inline
    def setJoinCondition(value: /* nodeOptions */ js.Any => Boolean): Self = this.set("joinCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteJoinCondition: Self = this.set("joinCondition", js.undefined)
    
    @scala.inline
    def setProcessProperties(
      value: (/* clusterOptions */ js.Any, /* childNodesOptions */ js.Array[_], /* childEdgesOptions */ js.Array[_]) => _
    ): Self = this.set("processProperties", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProcessProperties: Self = this.set("processProperties", js.undefined)
  }
}
