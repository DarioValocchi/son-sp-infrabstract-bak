
/**
 * @author Dario Valocchi (Ph.D.)
 * @mail d.valocchi@ucl.ac.uk
 * 
 *       Copyright 2016 [Dario Valocchi]
 * 
 *       Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 *       except in compliance with the License. You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *       Unless required by applicable law or agreed to in writing, software distributed under the
 *       License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *       either express or implied. See the License for the specific language governing permissions
 *       and limitations under the License.
 * 
 */

package sonata.kernel.adaptor.commons.nsd;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ForwardingGraph {

  // Forwarding Graph reference case.
  @JsonProperty("fg_group")
  private String fgGroup;
  @JsonProperty("fg_name")
  private String fgName;
  @JsonProperty("fg_version")
  private String fgVersion;
  @JsonProperty("fg_description")
  private String fgDescription;

  // Forwarding Graph description case.
  @JsonProperty("fg_id")
  private String fgId;
  @JsonProperty("number_of_endpoints")
  private int numberOfEndpoints;
  @JsonProperty("number_of_virtual_links")
  private int numberOfVirtualLinks;
  @JsonProperty("dependent_virtual_links")
  private ArrayList<String> dependentVirtualLinks;
  @JsonProperty("constituent_vnfs")
  private ArrayList<String> constituentVnfs;
  @JsonProperty("constituent_services")
  private ArrayList<String> constituentServices;
  @JsonProperty("network_forwarding_paths")
  private ArrayList<NetworkForwardingPath> networkForwardingPaths;


  public void setFgGroup(String fgGroup) {
    this.fgGroup = fgGroup;
  }

  public void setFgName(String fgName) {
    this.fgName = fgName;
  }

  public void setFgVersion(String fgVersion) {
    this.fgVersion = fgVersion;
  }

  public void setFgDescription(String fgDescription) {
    this.fgDescription = fgDescription;
  }

  public void setFgId(String fgId) {
    this.fgId = fgId;
  }

  public void setNumberOfEndpoints(int numberOfEndpoints) {
    this.numberOfEndpoints = numberOfEndpoints;
  }

  public void setNumberOfVirtualLinks(int numberOfVirtualLinks) {
    this.numberOfVirtualLinks = numberOfVirtualLinks;
  }

  public void setDependentVirtualLinks(ArrayList<String> dependentVirtualLinks) {
    this.dependentVirtualLinks = dependentVirtualLinks;
  }

  public void setConstituentVnfs(ArrayList<String> constituentVnfs) {
    this.constituentVnfs = constituentVnfs;
  }

  public void setConstituentServices(ArrayList<String> constituentServices) {
    this.constituentServices = constituentServices;
  }

  public void setNetworkForwardingPaths(ArrayList<NetworkForwardingPath> networkForwardingPaths) {
    this.networkForwardingPaths = networkForwardingPaths;
  }

  public String getFgGroup() {
    return fgGroup;
  }

  public String getFgName() {
    return fgName;
  }

  public String getFgVersion() {
    return fgVersion;
  }

  public String getFgDescription() {
    return fgDescription;
  }

  public String getFgId() {
    return fgId;
  }

  public int getNumberOfEndpoints() {
    return numberOfEndpoints;
  }

  public int getNumberOfVirtualLinks() {
    return numberOfVirtualLinks;
  }

  public ArrayList<String> getDependentVirtualLinks() {
    return dependentVirtualLinks;
  }

  public ArrayList<String> getConstituentVnfs() {
    return constituentVnfs;
  }

  public ArrayList<String> getConstituentServices() {
    return constituentServices;
  }

  public ArrayList<NetworkForwardingPath> getNetworkForwardingPaths() {
    return networkForwardingPaths;
  }

}