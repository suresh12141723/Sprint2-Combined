import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddshowComponent } from './addshow.component';

describe('AddshowComponent', () => {
  let component: AddshowComponent;
  let fixture: ComponentFixture<AddshowComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddshowComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddshowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
