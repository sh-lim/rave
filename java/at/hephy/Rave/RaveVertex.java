/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveVertex {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RaveVertex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveVertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveVertex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RaveVertex() {
    this(raveJNI.new_RaveVertex__SWIG_0(), true);
  }

  public RaveVertex(SWIGTYPE_p_rave__BasicVertex arg0) {
    this(raveJNI.new_RaveVertex__SWIG_1(SWIGTYPE_p_rave__BasicVertex.getCPtr(arg0)), true);
  }

  public RavePoint3D position() {
    return new RavePoint3D(raveJNI.RaveVertex_position(swigCPtr, this), false);
  }

  public RaveCovariance3D error() {
    return new RaveCovariance3D(raveJNI.RaveVertex_error(swigCPtr, this), false);
  }

  public RaveCovariance33D trackToVertexCovariance(RaveTrack i) {
    return new RaveCovariance33D(raveJNI.RaveVertex_trackToVertexCovariance(swigCPtr, this, RaveTrack.getCPtr(i), i), false);
  }

  public boolean hasTrackToVertexCovariance() {
    return raveJNI.RaveVertex_hasTrackToVertexCovariance(swigCPtr, this);
  }

  public RaveCovariance3D trackToTrackCovariance(RaveTrack i, RaveTrack j) {
    return new RaveCovariance3D(raveJNI.RaveVertex_trackToTrackCovariance(swigCPtr, this, RaveTrack.getCPtr(i), i, RaveTrack.getCPtr(j), j), false);
  }

  public void addTrackToVertexCovariance(RaveTrack t, RaveCovariance33D cov) {
    raveJNI.RaveVertex_addTrackToVertexCovariance(swigCPtr, this, RaveTrack.getCPtr(t), t, RaveCovariance33D.getCPtr(cov), cov);
  }

  public void addTrackToTrackCovariance(RaveTrack t1, RaveTrack t2, RaveCovariance3D cov) {
    raveJNI.RaveVertex_addTrackToTrackCovariance(swigCPtr, this, RaveTrack.getCPtr(t1), t1, RaveTrack.getCPtr(t2), t2, RaveCovariance3D.getCPtr(cov), cov);
  }

  public WeightedRaveTrackContainer weightedTracks() {
    return new WeightedRaveTrackContainer(raveJNI.RaveVertex_weightedTracks(swigCPtr, this), false);
  }

  public RaveTrackContainer tracks() {
    return new RaveTrackContainer(raveJNI.RaveVertex_tracks(swigCPtr, this), true);
  }

  public RaveTrackContainer refittedTracks() {
    return new RaveTrackContainer(raveJNI.RaveVertex_refittedTracks(swigCPtr, this), true);
  }

  public WeightedRaveTrackContainer weightedRefittedTracks() {
    return new WeightedRaveTrackContainer(raveJNI.RaveVertex_weightedRefittedTracks(swigCPtr, this), false);
  }

  public float ndf() {
    return raveJNI.RaveVertex_ndf(swigCPtr, this);
  }

  public float chiSquared() {
    return raveJNI.RaveVertex_chiSquared(swigCPtr, this);
  }

  public int id() {
    return raveJNI.RaveVertex_id(swigCPtr, this);
  }

  public boolean isValid() {
    return raveJNI.RaveVertex_isValid(swigCPtr, this);
  }

  public boolean hasRefittedTracks() {
    return raveJNI.RaveVertex_hasRefittedTracks(swigCPtr, this);
  }

  public boolean RaveEquals(RaveVertex arg0) {
    return raveJNI.RaveVertex_RaveEquals(swigCPtr, this, RaveVertex.getCPtr(arg0), arg0);
  }

  public RaveTrack refittedTrack(RaveTrack orig) {
    return new RaveTrack(raveJNI.RaveVertex_refittedTrack(swigCPtr, this, RaveTrack.getCPtr(orig), orig), true);
  }

  public SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t components() {
    return new SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t(raveJNI.RaveVertex_components(swigCPtr, this), true);
  }

  public RaveVertex(RavePoint3D arg0, RaveCovariance3D arg1, WeightedRaveTrackContainer tracks, float ndf, float chi2, SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t components) {
    this(raveJNI.new_ConstructWithWeightedTracks(RavePoint3D.getCPtr(arg0), arg0, RaveCovariance3D.getCPtr(arg1), arg1, WeightedRaveTrackContainer.getCPtr(tracks), tracks, ndf, chi2, SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t.getCPtr(components)), true);
  }

  public RaveVertex(RavePoint3D arg0, RaveCovariance3D arg1, RaveTrackContainer tracks, float ndf, float chi2, SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t components) {
    this(raveJNI.new_ConstructWithTracks(RavePoint3D.getCPtr(arg0), arg0, RaveCovariance3D.getCPtr(arg1), arg1, RaveTrackContainer.getCPtr(tracks), tracks, ndf, chi2, SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t.getCPtr(components)), true);
  }

  public RaveVertex(RavePoint3D arg0, RaveCovariance3D arg1, WeightedRaveTrackContainer tracks, WeightedRaveTrackContainer smoothedtracks, float ndf, float chi2, SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t components) {
    this(raveJNI.new_ConstructWithSmoothedWeightedTracks(RavePoint3D.getCPtr(arg0), arg0, RaveCovariance3D.getCPtr(arg1), arg1, WeightedRaveTrackContainer.getCPtr(tracks), tracks, WeightedRaveTrackContainer.getCPtr(smoothedtracks), smoothedtracks, ndf, chi2, SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t.getCPtr(components)), true);
  }

  public RaveVertex(RavePoint3D arg0, RaveCovariance3D arg1, RaveTrackContainer tracks, RaveTrackContainer smoothedtracks, float ndf, float chi2, SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t components) {
    this(raveJNI.new_RaveVertex__SWIG_2(RavePoint3D.getCPtr(arg0), arg0, RaveCovariance3D.getCPtr(arg1), arg1, RaveTrackContainer.getCPtr(tracks), tracks, RaveTrackContainer.getCPtr(smoothedtracks), smoothedtracks, ndf, chi2, SWIGTYPE_p_std__vectorT_std__pairT_float_rave__Vertex_t_t.getCPtr(components)), true);
  }

  public String toString() {
    return raveJNI.RaveVertex_toString(swigCPtr, this);
  }

  public String __str__() {
    return raveJNI.RaveVertex___str__(swigCPtr, this);
  }

}
