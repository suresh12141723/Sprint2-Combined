import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewshowComponent } from './viewshow.component';

describe('ViewshowComponent', () => {
  let component: ViewshowComponent;
  let fixture: ComponentFixture<ViewshowComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewshowComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewshowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
